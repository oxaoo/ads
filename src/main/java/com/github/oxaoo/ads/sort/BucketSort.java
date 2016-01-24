package com.github.oxaoo.ads.sort;

public class BucketSort {
    private int[] array;
    private int[][] buckets;
    private double range;
    private int min;

    public static void run(int[] array) {
        if (array == null || array.length < 2) return;

        BucketSort bs = new BucketSort();
        bs.array = array;
        if (!bs.allocBuckets()) return;
        bs.sort();
    }

    private void sort() {
        int rb = array.length;
        int b;

        //distribution in buckets.
        int[] counter = new int[buckets.length];
        for (int i = 0; i < rb; i++) {
            //cast to long, to avoid overflow.
            b = (int) (((long) array[i] - (long) min) / range);
            buckets[b][counter[b]++] = array[i];
        }

        int shift = 0;
        //sorting the buckets.
        for (int i = 0; i < buckets.length; i++) {
            InsertionSort.run(buckets[i], 0, counter[i]);
            System.arraycopy(buckets[i], 0, array, shift, counter[i]);
            shift += counter[i];
        }
    }

    //determining the number of blocks.
    private boolean allocBuckets() {
        int rb = array.length;
        int max = min = array[0];

        for (int i = 1; i < rb; i++)
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];

        //array of identical elements.
        if (max == min) return false;

        int sizeArray = array.length;
        int numBuckets;
        //avoid overflow.
        long dif = ((long) max) - ((long) min);
        if (dif <= sizeArray) {
            numBuckets = max - min + 1;
            range = 1.0;
        } else {
            numBuckets = sizeArray;
            range = (double) (dif + 1) / (double) sizeArray;
        }
        buckets = new int[numBuckets][sizeArray];

        return true;
    }
}

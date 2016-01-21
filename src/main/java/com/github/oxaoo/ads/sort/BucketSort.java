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
        if (!bs.allocBucket()) return;
        bs.sort();
    }

    private void sort() {
        int rb = array.length;
        int b;

        //distribution in buckets.
        int[] counter = new int[buckets.length];
        for (int i = 0; i < rb; i++) {
            b = (int) ((array[i] - min) / range);
            buckets[b][counter[b]++] = array[i];
        }

        int shift = 0;
        //sorting the buckets.
        for (int i = 0; i < buckets.length; i++) {
            insertionSort(buckets[i], counter[i]);
            System.arraycopy(buckets[i], 0, array, shift, counter[i]);
            shift += counter[i];
        }
    }

    //determining the number of blocks.
    private boolean allocBucket() {
        int rb = array.length;
        min = array[0];
        int max = min;

        for (int i = 1; i < rb; i++)
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];

        //array of identical elements.
        if (max == min) return false;

        int sizeArray = array.length;
        int numBuckets;
        if (max - min <= sizeArray) {
            numBuckets = max - min + 1;
            range = 1;
        } else {
            numBuckets = sizeArray + 1;
            range = (double) (max - min) / (double) sizeArray;
        }
        buckets = new int[numBuckets][sizeArray];

        return true;
    }

    //ordinary insertion sort.
    private void insertionSort(int[] array, int rb) {
        int cur, j;
        for (int i = 1; i < rb; i++) {
            cur = array[i];
            for (j = i - 1; j >= 0 && cur < array[j]; j--)
                array[j + 1] = array[j];
            array[j + 1] = cur;
        }
    }
}

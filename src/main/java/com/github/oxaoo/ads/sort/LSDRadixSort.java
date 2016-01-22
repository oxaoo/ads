package com.github.oxaoo.ads.sort;


public class LSDRadixSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2)
            return;

        LSDRadixSort lsd = new LSDRadixSort();
        lsd.array = array;
        lsd.sort();
    }

    private void sort() {
        int mask = 255; //hex = ff.
        int bytes = 4; // for int.
        int k = 256; //the number of possible values.
        int n = array.length; //size of array.
        int[] tempArray = new int[n];

        for (int b = 0; b < bytes; b++) {

            int[] count = new int[k + 1];
            int c;
            //frequency of values.
            for (int i = 0; i < n; i++) {
                c = (array[i] >> 8 * b) & mask;
                count[c + 1]++;
            }

            //the number of items before...
            for (int ik = 1; ik <= k; ik++)
                count[ik] += count[ik - 1];

            //for the most significant byte, i.e. accounting negative values.
            // 0-127[00-7f]: positive number; 128-255[80-ff]: negative number.
            if (b == bytes - 1) {
                int offset1 = count[k] - count[k / 2];
                int offset2 = count[k / 2];
                for (int s = 0; s < k / 2; s++)
                    count[s] += offset1;
                for (int s = k / 2; s < k; s++)
                    count[s] -= offset2;
            }

            //ordering elements.
            for (int i = 0; i < n; i++) {
                c = (array[i] >> 8 * b) & mask;
                tempArray[count[c]++] = array[i];
            }

            //copy back.
            for (int i = 0; i < n; i++)
                array[i] = tempArray[i];
        }
    }
}
package com.github.oxaoo.ads.sort;


public class LSDRadixSort {
    private int[] array;
    private int mask = 255; //hex = ff.

    public static void run(int[] array) {
        if (array == null || array.length < 2)
            return;

        LSDRadixSort lsd = new LSDRadixSort();
        lsd.array = array;
        lsd.sort();
    }

    private void sort() {
        int bytes = 4; // for int.
        int m = 256; //the number of possible values.
        int n = array.length; //size of array.
        int[] aux = new int[n]; //auxiliary array.

        for (int k = 0; k < bytes; k++) {
            int[] count = new int[m + 1];
            int c;
            //frequency of values.
            for (int a : array)
                count[value(a, k) + 1]++;

            //the number of items before...
            for (int im = 1; im <= m; im++)
                count[im] += count[im - 1];

            if (k == bytes - 1)
                processingSignByte(count, m);

            //ordering elements.
            for (int a : array)
                aux[count[value(a, k)]++] = a;

            //copy back.
            System.arraycopy(aux, 0, array, 0, n);
        }
    }

    //for the most significant byte, i.e. accounting negative values.
    // 0-127[00-7f]: positive number; 128-255[80-ff]: negative number.
    private void processingSignByte(int[] count, int m) {
        int offset1 = count[m] - count[m / 2];
        int offset2 = count[m / 2];
        for (int i = 0; i < m / 2; i++)
            count[i] += offset1;
        for (int i = m / 2; i < m; i++)
            count[i] -= offset2;
    }

    //byte value.
    private int value(int num, int offset) {
        return (num >> 8 * offset) & mask;
    }
}
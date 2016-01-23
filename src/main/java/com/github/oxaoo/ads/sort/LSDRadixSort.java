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
        int[] aux = new int[array.length];

        //for 31 to 0.
        for (int shift = Integer.SIZE - 1, j = 0; shift >= 0; shift--, j = 0) {
            for (int i = 0; i < array.length; i++) {
                //if cur bit is 1.
                boolean isOne = array[i] << shift >= 0;
                //if last bit (#31) is 1, then it number is negative.
                //aux contains the numbers of the odd bits (expect a msb).
                //array contains the numbers of the even bits (expect a msb).
                if (shift == 0 ? !isOne : isOne)
                    aux[j++] = array[i];
                else
                    array[i - j] = array[i];
            }
            //merge of ordered numbers.
            for (int i = j; i < aux.length; i++)
                aux[i] = array[i - j];

            //copy back.
            System.arraycopy(aux, 0, array, 0, aux.length);
        }
    }
}
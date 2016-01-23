package com.github.oxaoo.ads.sort;

public class MSDRadixSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 0)
            return;

        MSDRadixSort msd = new MSDRadixSort();
        msd.array = array;
        msd.sort(0, array.length, Integer.SIZE - 1);
    }

    private void sort(int lb, int rb, int shift) {
        if (shift < 0 || lb >= rb - 1) return;

        int[] aux = new int[rb - lb];
        int j = 0;
        for (int i = lb; i < rb; i++) {

            boolean isOne = ((array[i] >> shift) &1) == 1;

            //if last bit (#31) is 1, then it number is negative.
            //array contains the numbers of the odd bits (expect a msb).
            //aux contains the numbers of the even bits (expect a msb).
            if (shift == Integer.SIZE - 1 ? !isOne : isOne)
                array[i - j] = array[i];
            else
                aux[j++] = array[i];
        }
        //merge lower and higher numbers.
        for (int i = j; i < aux.length; i++)
            aux[i] = array[lb + i - j];

        System.arraycopy(aux, 0, array, lb, aux.length);

        sort(lb, lb + j, shift - 1);
        sort(lb + j, rb, shift - 1);
    }
}

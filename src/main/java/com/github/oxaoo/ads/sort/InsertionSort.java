package com.github.oxaoo.ads.sort;

import java.util.Arrays;

public class InsertionSort {
    private int[] array;

    public static void run(int[] array, int lb, int rb) {
        if (array == null || array.length < 2
                || lb < 0 || rb > array.length || lb >= rb)
            return;

        int[] subArray = Arrays.copyOfRange(array, lb, rb);
        run(subArray);
        System.arraycopy(subArray, 0, array, 0, subArray.length);
    }

    public static void run(int[] array) {
        if (array == null || array.length < 2) return;

        InsertionSort is = new InsertionSort();
        is.array = array;
        is.sort();
    }

    //classic algorithm.
    private void sort() {
        int rb = array.length;

        int cur, j;
        for (int i = 1; i < rb; i++) {
            cur = array[i];
            for (j = i - 1; j >= 0 && cur < array[j]; j--)
                array[j + 1] = array[j];
            array[j + 1] = cur;
        }
    }


    //improved algorithm.
    private void sort2() {
        int rb = array.length;

        //search minimum element in array.
        int indexOfMin = 0;
        for (int i = 1; i < rb; i++)
            if (array[i] < array[indexOfMin])
                indexOfMin = i;

        int temp = array[0];
        array[0] = array[indexOfMin];
        array[indexOfMin] = temp;

        int cur, j;
        for (int i = 1; i < rb; i++) {
            cur = array[i];
            j = i - 1;
            while (cur < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = cur;
        }
    }

    public static void run2(int[] array) {
        if (array == null || array.length < 2) return;

        InsertionSort is = new InsertionSort();
        is.array = array;
        is.sort2();
    }
}

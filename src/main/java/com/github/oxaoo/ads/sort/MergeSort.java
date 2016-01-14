package com.github.oxaoo.ads.sort;

public class MergeSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2) return;

        MergeSort ms = new MergeSort();
        ms.array = array;
        ms.sort(0, array.length - 1);
    }

    private void sort(int lb, int rb) {
        if (rb == lb) return;

        int middle = lb + (rb - lb) / 2;

        sort(lb, middle);
        sort(middle + 1, rb);
        merge(lb, middle, rb);
    }

    private void merge(int lb, int middle, int rb) {
        int[] tempArray = new int[rb - lb + 1];
        int i = lb, j = middle + 1;

        int t = 0;
        while(i <= middle && j <= rb) {
            if (array[i] < array[j])
                tempArray[t++] = array[i++];
            else
                tempArray[t++] = array[j++];
        }

        while (i <= middle) tempArray[t++] = array[i++];
        while (j <= rb) tempArray[t++] = array[j++];

        for (int a = lb; a <= rb; a++)
            array[a] = tempArray[a - lb];
    }
}

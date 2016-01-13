package com.github.oxaoo.ads.sort;

public class QuickSort {
    private int[] array;

    public static void run(int[] array) {

        if (array == null || array.length == 0) return;

        QuickSort qs = new QuickSort();
        qs.array = array;
        qs.sort(0, array.length - 1);
    }

    private void sort(int lb, int rb) {

        if (rb - lb < 2) {
            if (array[lb] > array[rb]) exchange(lb, rb);
            return;
        }

        int begin = lb, end = rb;
        int pivotIndex = lb + (rb - lb) / 2;
        int pivot = array[pivotIndex];

        while (lb < rb) {

            while (array[lb] < pivot) lb++;
            while (array[rb] > pivot) rb--;

            if (lb < rb) {
                exchange(lb, rb);
                lb++;
                rb--;
            }
        }

        if (rb > begin) sort(begin ,rb);
        if (lb < end) sort(lb, end);
    }

    private void exchange(int i, int j) {

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

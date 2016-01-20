package com.github.oxaoo.ads.sort;

public class SelectionSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2) return;

        SelectionSort ss = new SelectionSort();
        ss.array = array;
        ss.sort();
    }

    private void sort() {
        int rb = array.length;
        int indexMin;
        for (int i = 0; i < rb; i++){
            indexMin = i;
            for (int j = i + 1; j < rb; j++)
                if (array[j] < array[indexMin])
                    indexMin = j;
            exchange(i, indexMin);
        }
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

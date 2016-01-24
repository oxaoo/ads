package com.github.oxaoo.ads.sort;

public class CountingSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2)
            return;

        CountingSort cs = new CountingSort();
        cs.array = array;
        cs.sort();
    }

    private void sort() {
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];

        int[] aux = new int[max - min + 1];
        //counting entry.
        for (int i = 0; i < array.length; i++)
            aux[array[i] - min]++;

        for (int i = 0, j = 0; i < aux.length; i++)
            while (aux[i] > 0) {
                array[j++] = i + min;
                aux[i]--;
            }
    }
}

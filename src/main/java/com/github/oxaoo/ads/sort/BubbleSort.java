package com.github.oxaoo.ads.sort;


public class BubbleSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2)
            return;

        BubbleSort bs = new BubbleSort();
        bs.array = array;
        bs.sort();
    }

    private void sort() {
        boolean isExchange = false;
        int rb = array.length - 1;

        for (int i = rb; i > 0; i--) {
            isExchange = false;
            for (int j = 0; j < i; j++)
                if (array[j] > array[j + 1]) {
                    exchange(j, j + 1);
                    isExchange = true;
                }
            if (!isExchange) break;
        }
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

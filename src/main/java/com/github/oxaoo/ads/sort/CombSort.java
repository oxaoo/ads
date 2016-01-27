package com.github.oxaoo.ads.sort;

public class CombSort {
    private int[] array;

    public static void run(int[] array) {
        if(array == null || array.length < 2)
            return;

        CombSort cs = new CombSort();
        cs.array = array;
        double shrinkFactor = cs.genShrinkFactor();
        cs.sort(shrinkFactor);
    }

    private void sort(double shrinkFactor) {
        int gap = array.length;
        int rb = array.length;
        boolean isExchange;

        do {
            isExchange = false;
            if (gap > 1) gap /= shrinkFactor;

            for (int i = 0; i + gap < rb; i++)
                if (array[i] > array[i + gap]) {
                    isExchange = true;
                    exchange(i, i + gap);
                }
        } while (gap > 1 || isExchange);
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private double genShrinkFactor() {
        //gold ratio = 1.618.
        return  1 / (1 - 1 / (Math.exp(1.618)));
    }
}

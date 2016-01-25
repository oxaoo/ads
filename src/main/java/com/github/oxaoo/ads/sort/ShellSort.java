package com.github.oxaoo.ads.sort;

public class ShellSort {
    private int[] array;
    //because 9 * 2^28 - 9 * 2^14 + 1 = 2 415 771 649 (e.g. > 2^32 - 1).
    private int[] gaps = new int[29];

    public static void run(int[] array) {
        if (array == null || array.length < 2)
            return;

        ShellSort ss = new ShellSort();
        ss.array = array;
        int numGaps = ss.genGaps();
        ss.sort(numGaps);
    }

    //generate gaps of the Sedgewick's method.
    private int genGaps() {
        int i = 0;
        int sizeArray = array.length;
        int p, p1, p2;
        p = p1 = p2 = 1;

        do {
            if (i % 2 == 0) { //even.
                gaps[i] = 9 * p - 9 * p2 + 1;
                p1 *= 2;
                p2 *= 2;
            } else //odd.
                gaps[i] = 8 * p - 6 * p1 + 1;
            p *= 2;
        } while (3 * gaps[i++] < sizeArray);

        return i - 1;
    }

    private void sort(int numGaps) {
        int rb = array.length;
        int cur, gap, j;
        for (int g = numGaps; g >= 0; g--) {
            gap = gaps[g];
            //insertion sort.
            for (int i = gap; i < rb; i++) {
                cur = array[i];
                for (j = i - gap; j >= 0 && cur < array[j]; j -= gap)
                    array[j + gap] = array[j];
                array[j + gap] = cur;
            }
        }
    }
}

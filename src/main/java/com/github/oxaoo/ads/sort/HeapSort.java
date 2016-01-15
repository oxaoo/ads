package com.github.oxaoo.ads.sort;

public class HeapSort {
    private int[] array;

    public static void run(int[] array) {
        if (array == null || array.length < 2) return;

        HeapSort hs = new HeapSort();
        hs.array = array;
        hs.sort();
    }

    private void sort() {
        int middle = array.length / 2 - 1;

        //present an array of like a pyramid.
        for (int i = middle; i >= 0; i--)
            siftDown(i, array.length - 1);

        //sorting.
        for (int i = array.length - 1; i > 0; i--) {
            swap(i, 0);
            siftDown(0, i - 1);
        }
    }

    private void siftDown(int cur, int rb) {
        if (rb % 2 == 0 && cur >= rb / 2) return;
        if (cur > rb / 2) return;

        int child = 2 * cur + 1;
        if (child < rb && array[child] < array[child + 1]) child++;

        if (array[cur] >= array[child]) return;

        swap(cur, child);
        siftDown(child, rb);
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

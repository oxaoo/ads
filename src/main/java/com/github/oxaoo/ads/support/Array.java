package com.github.oxaoo.ads.support;

import java.util.Random;

public class Array {

    public static int[] generate(int size) {
        return generate(size, 0, Integer.MAX_VALUE - 1);
    }

    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(max - min + 1) + min;
        return array;
    }

    public static void print(int[] array) {
        if (array == null) return;

        for (int anArray : array)
            System.out.print(anArray + " ");
        System.out.println();
    }
}

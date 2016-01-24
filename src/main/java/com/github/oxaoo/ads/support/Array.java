package com.github.oxaoo.ads.support;

import java.util.Random;

public class Array {
    public enum TypeArray {SIGNED, UNSIGNED, SORTED, SAME, RSORTED, NON};

    private static int[] array;
    private static TypeArray typeArray = TypeArray.NON;

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

    public static int[] getArray(){
        if (array != null) return array.clone();
        else return newArray(1000, TypeArray.UNSIGNED);
    }

    public static int[] newArray(int size, TypeArray type){
        switch (type){
            case SIGNED:
                return signedArray(size);
            case UNSIGNED:
                return unsignedArray(size);
            case SORTED:
                return sortedArray(size);
            case SAME:
                return sameArray(size);
            case RSORTED:
                return rsortedArray(size);
            default:
                return new int[0];
        }
    }

    private static int[] rsortedArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = size - i;
        return array.clone();
    }

    private static int[] sameArray(int size) {
        array = new int[size];
        int randNum = new Random().nextInt();
        for (int i = 0; i < size; i++)
            array[i] = randNum;
        return array.clone();
    }

    private static int[] sortedArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = i;
        return array.clone();
    }

    private static int[] unsignedArray(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(Integer.MAX_VALUE);
        return array.clone();
    }

    private static int[] signedArray(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(Integer.MAX_VALUE) - random.nextInt(Integer.MAX_VALUE / 2);
        return array.clone();
    }
}

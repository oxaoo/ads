import com.github.oxaoo.ads.sort.*;
import com.github.oxaoo.ads.support.Array;

public class Main {

    public static void main(String[] args) {

        quickSort();
        mergeSort();
        heapSort();
        bubbleSort();
        insertionSort();
        selectionSort();
        bucketSort();
        lsdSort();
        msdSort();
        countingSort();
        shellSort();
        combSort();
    }

    private static void combSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        CombSort.run(array);
        System.out.println("Array after CombSort: ");
        Array.print(array);
    }

    private static void shellSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        ShellSort.run(array);
        System.out.println("Array after ShellSort: ");
        Array.print(array);
    }

    private static void countingSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        CountingSort.run(array);
        System.out.println("Array after CountingSort: ");
        Array.print(array);
    }

    private static void msdSort() {

        int[] array = Array.generate(10, 0, 10);
        //int[] array = {5, -2, 28, 657, -657, 0, 12, 66, 0, 69443, -44, 1};
        System.out.println("Array: ");
        Array.print(array);
        MSDRadixSort.run(array);
        System.out.println("Array after LSDRadixtSort: ");
        Array.print(array);
    }

    private static void lsdSort() {

        int[] array = Array.generate(10, 0, 10);
        //int[] array = {5, -2, 28, 657, -657, 0, 12, 66, 0, 69443, -44, 1};
        System.out.println("Array: ");
        Array.print(array);
        LSDRadixSort.run(array);
        System.out.println("Array after LSDRadixtSort: ");
        Array.print(array);
    }

    private static void bucketSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        BucketSort.run(array);
        System.out.println("Array after BucketSort: ");
        Array.print(array);
    }

    private static void selectionSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        SelectionSort.run(array);
        System.out.println("Array after SelectionSort: ");
        Array.print(array);
    }

    private static void insertionSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        InsertionSort.run(array);
        System.out.println("Array after InsertionSort: ");
        Array.print(array);
    }

    private static void heapSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        HeapSort.run(array);
        System.out.println("Array after HeapSort: ");
        Array.print(array);
    }

    private static void quickSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        QuickSort.run(array);
        System.out.println("Array after QuickSort: ");
        Array.print(array);
    }

    private static void mergeSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        MergeSort.run(array);
        System.out.println("Array after MergeSort: ");
        Array.print(array);
    }

    private static void bubbleSort() {

        int[] array = Array.generate(10, 0, 10);
        System.out.println("Array: ");
        Array.print(array);
        BubbleSort.run(array);
        System.out.println("Array after BubbleSort: ");
        Array.print(array);
    }
}

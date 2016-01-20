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
        //BubbleSort.run(array);
        BubbleSortRepeat.run(array);
        System.out.println("Array after BubbleSort: ");
        Array.print(array);
    }
}

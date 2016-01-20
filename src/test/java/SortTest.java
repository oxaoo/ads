import com.github.oxaoo.ads.sort.*;
import com.github.oxaoo.ads.support.Array;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void QuickSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            QuickSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void MergeSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            MergeSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void HeapSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            HeapSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void BubbleSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            BubbleSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void InsertionSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            InsertionSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void InsertionSort2Test() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            InsertionSort.run2(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void SelectionSortTest() {
        for (int i = 0; i < 1000; i++) {
            int[] array = Array.generate(1000);
            SelectionSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }
}

import com.github.oxaoo.ads.sort.*;
import com.github.oxaoo.ads.support.Array;
import com.github.oxaoo.ads.support.Array.TypeArray;
import org.junit.Before;
import org.junit.Test;

import static com.github.oxaoo.ads.support.Array.TypeArray.*;
import static org.junit.Assert.*;

public class SortTest {

    private int iter = 1000;
    private int size = 1000;
    private TypeArray type = UNSIGNED;
    private int[][] arrays;

    public int[] getArray(int index) {
        return arrays[index].clone();
    }

    @Before
    public void setUp() {
        arrays = new int[iter][];
        for (int i = 0; i < iter; i++) {
            arrays[i] = Array.newArray(size, type);
        }
    }

    @Test
    public void QuickSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            QuickSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void MergeSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            MergeSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void HeapSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            HeapSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void BubbleSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            BubbleSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void InsertionSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            InsertionSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void InsertionSort2Test() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            InsertionSort.run2(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void SelectionSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            SelectionSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void BucketSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            BucketSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void LSDSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            LSDRadixSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void MSDSortTest() {
        for (int i = 0; i < iter; i++) {
            //int[] array = Array.generate(1000);
            int[] array = getArray(i);
            MSDRadixSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }

    @Test
    public void CountingSortTest() {
        for (int i = 0; i < iter; i++) {
            //avoid jvm overflow.
            int[] array = Array.generate(1000, 0, Integer.MAX_VALUE / 100);
            //int[] array = getArray(i);
            CountingSort.run(array);
            for (int j = 1; j < array.length; j++)
                assertTrue(array[j - 1] <= array[j]);
        }
    }
}

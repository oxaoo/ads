import com.github.oxaoo.ads.sort.MergeSort;
import com.github.oxaoo.ads.sort.QuickSort;
import com.github.oxaoo.ads.sort.QuickSortRepeat;
import com.github.oxaoo.ads.support.Array;

public class Main {

    public static void main(String[] args) {

        quickSort();
        mergeSort();
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
}

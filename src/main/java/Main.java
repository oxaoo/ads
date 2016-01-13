import com.github.oxaoo.ads.sort.QuickSort;
import com.github.oxaoo.ads.support.Array;

public class Main {

    public static void main(String[] args) {

        quickSort();
    }

    private static void quickSort() {

        int[] array = Array.generate(50, 0, 99);
        System.out.println("Array: ");
        Array.print(array);
        QuickSort.run(array);
        System.out.println("Array after QuickSort: ");
        Array.print(array);
    }
}

import com.github.oxaoo.ads.sort.QuickSort;
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
}

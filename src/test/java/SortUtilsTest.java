import org.example.SortUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class SortUtilsTest {
    @Test
    public void testEmptyArray() {
        int[] array = {};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] array = {-3, -1, -2, -5, -4};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] array = {4, 2, 4, 3, 1};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 4}, array);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] array = {1};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testReversedArray() {
        int[] array = {5, 4, 3, 2, 1};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testArrayWithZero() {
        int[] array = {0, 3, 2, 1, 4};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, array);
    }

    @Test
    public void testArrayWithLargeValues() {
        int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, array);
    }

    @Test
    public void testArrayWithEqualElements() {
        int[] array = {7, 7, 7, 7, 7};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{7, 7, 7, 7, 7}, array);
    }

    @Test
    public void testPivotInMiddle() {
        int[] array = {3, 1, 4, 5, 2};
        SortUtils.quickSort(array, 0, array.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        SortUtils.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i + 1]);
        }
    }

}

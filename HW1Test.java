import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class HW1Test {

    //Test sorting a normal unsorted array
    @Test
    public void testMergeSortNormalArray() {
        int[] arr = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] expected = {1, 2, 2, 3, 4, 5, 6, 6};

        HW1.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }

    //Test sorting an already sorted array.
    @Test
    public void testMergeSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        HW1.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }

    //Test sorting an array with duplicate values.
    @Test
    public void testMergeSortWithDuplicates() {
        int[] arr = {3, 1, 2, 3, 1};
        int[] expected = {1, 1, 2, 3, 3};

        HW1.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }

    //Test sorting a single-element array.
    @Test
    public void testMergeSortSingleElement() {
        int[] arr = {42};
        int[] expected = {42};

        HW1.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }

    //Test sorting an empty array.
    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        HW1.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }
}

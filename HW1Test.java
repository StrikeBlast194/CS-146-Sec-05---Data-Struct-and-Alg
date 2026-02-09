import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HW1Test {

    @Test
    void testNormalMerge() {
        int[] a = {1, 4, 7};
        int[] b = {2, 3, 6};
        int[] expected = {1, 2, 3, 4, 6, 7};

        assertArrayEquals(expected, HW1Test.mergeArrays(a, b));
    }

    @Test
    void testOneEmptyArray() {
        int[] a = {};
        int[] b = {1, 2, 3};
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, HW1Test.mergeArrays(a, b));
    }

    @Test
    void testBothEmpty() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};

        assertArrayEquals(expected, HW1Test.mergeArrays(a, b));
    }

    @Test
    void testDuplicates() {
        int[] a = {1, 2, 2};
        int[] b = {2, 3};
        int[] expected = {1, 2, 2, 2, 3};

        assertArrayEquals(expected, HW1Test.mergeArrays(a, b));
    }

    @Test
    void testNegativeNumbers() {
        int[] a = {-5, -1, 3};
        int[] b = {-2, 4};
        int[] expected = {-5, -2, -1, 3, 4};

        assertArrayEquals(expected, HW1Test.mergeArrays(a, b));
    }
}

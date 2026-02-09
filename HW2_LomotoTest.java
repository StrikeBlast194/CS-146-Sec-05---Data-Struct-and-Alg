import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HW2_LomotoTest {

    @Test
    void testSortedArray() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        HW2_Lomoto.partition(arr);

        assertTrue(isLomutoPartitioned(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};

        // Should not throw an exception
        assertDoesNotThrow(() -> HW2_Lomoto.partition(arr));
    }

    @Test
    void testUnsortedArray() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        HW2_Lomoto.partition(arr);

        assertTrue(isLomutoPartitioned(arr));
    }

    /**
     * Helper method to verify Lomuto partition property:
     * All elements less than pivot come before it,
     * all elements greater than or equal to pivot come after.
     */
    private boolean isLomutoPartitioned(int[] arr) {
        if (arr.length == 0) return true;

        int pivot = arr[arr.length - 1];

        boolean pivotSeen = false;
        for (int value : arr) {
            if (value == pivot && !pivotSeen) {
                pivotSeen = true;
            } else if (!pivotSeen && value >= pivot) {
                return false;
            } else if (pivotSeen && value < pivot) {
                return false;
            }
        }
        return true;
    }
}

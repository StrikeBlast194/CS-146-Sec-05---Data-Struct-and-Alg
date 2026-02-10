import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HoarePartitionTest {

    @Test
    void testSortedArray() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int index = HoarePartition.hoarePartition(arr, 0, arr.length - 1);

        assertTrue(isHoarePartitioned(arr, index));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, HoarePartition.hoarePartition(arr, 0, 0));
    }

    @Test
    void testUnsortedArray() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        int index = HoarePartition.hoarePartition(arr, 0, arr.length - 1);

        assertTrue(isHoarePartitioned(arr, index));
    }

    private boolean isHoarePartitioned(int[] arr, int index) {
        int pivot = arr[index];
        for (int i = 0; i <= index; i++) {
            if (arr[i] > pivot) return false;
        }
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < pivot) return false;
        }
        return true;
    }
}

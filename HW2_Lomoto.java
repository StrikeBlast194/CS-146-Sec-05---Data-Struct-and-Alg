/**
 * Lomuto Partition Algorithm
 */ 
import java.util.Arrays;

public class HW2_Lomoto {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 9, 10, 3, 6, 8};
        
        // Apply Lomoto Partition 
        lomutoPartition(arr);
        
        printArray(arr);
    }
    // Function to partition the array according 
    // to pivot index element
    static void lomutoPartition(int[] arr) {
        int n = arr.length;
        int pivot = arr[n - 1]; // last element
        
        // i acts as boundary between smaller and 
        // larger element compared to pivot
        int i = -1;
        for (int j = 0; j < n; j++) {
            
            // If smaller element is found expand the 
            // boundary and swapping it with boundary element.
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // place the pivot at its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[n - 1];
        arr[n - 1] = temp;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}

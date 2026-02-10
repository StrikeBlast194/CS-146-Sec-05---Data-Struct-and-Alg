/**
 * Hoare's Partition Algorithm
 */  

import java.util.Arrays;

class HW2_Hoare {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        
        hoarePartition(arr);
      
        printArray(arr);
    }
  
    // Function to partition the array according 
    // to pivot index element
    static void hoarePartition(int[] arr) {
        int n = arr.length;
        int pivot = arr[0];
        int i = -1, j = n;
        while (true) {
          
            // find next element larger than pivot 
            // from the left
            do {
                i++;
            } while (arr[i] < pivot);
            
            // find next element smaller than pivot 
            // from the right
            do {
                j--;
            } while (arr[j] > pivot);
            
            // if left and right crosses each other
            // no swapping required
            if (i > j) break;
            
            // swap larger and smaller elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
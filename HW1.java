/**
 *  A method to merge two sorted array together
 */

public class HW1 {

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
	
		int[] mergedArr = mergeArrays(a, b);
        printArray(mergedArr);
	}

    // Method to merge two sorted arrays 
    public static int[] mergeArrays(int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        // Create result array with combined size
        int[] result = new int[leftSize + rightSize];

        int i = 0; // index for left array
        int j = 0; // index for right array
        int k = 0; // index for result array

        // Compare elements from both arrays and copy the smaller one
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from left array
        while (i < leftSize) {
            result[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from right array
        while (j < rightSize) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
    
    // Print all elements of array.
    private static void printArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i]);
    	}
    }
}

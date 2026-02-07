/**
 * Merge sort on an integer array.
 * The method recursively divides the array in halves, sort 
 * each half, then merges them back together. 
 */

public class HW1 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6, 1, 3, 2, 6};
	
		System.out.println("Before:");
		printArray(arr);

		// Sort the array using merge sort
		mergeSort(arr);

		System.out.println("After:");
		printArray(arr);
	}

	// Recursively merge sorts the given array
    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // Case for arrays of size 0 or 1 already sorted
        if (inputLength < 2) {
        	return;
        }

        // Find the midpoint of array
        int mid = inputLength / 2;

        // Create subarrays for left and right halves
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[inputLength - mid];

        // Values of left array
        for (int i = 0; i < mid; i++) {
        	leftHalf[i] = inputArray[i];
        }

        // Values of right arrays
        for (int i = mid; i < inputLength; i++) {
        	rightHalf[i - mid] = inputArray[i];
        }

        // Recursively merge sort both halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves arrays back together into the original array
        merge(inputArray, leftHalf, rightHalf);
    }

    // Merge two sorted subarrays into a single sorted array
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
    	int leftSize = leftHalf.length;
    	int rightSize = rightHalf.length;

    	int i = 0; // index for leftHalf
    	int j = 0; // index for rightHalf
    	int k = 0; // index for inputArray

    	// Compare elements from both arrays and copy the smaller one
    	while (i < leftSize && j < rightSize) {
    		if (leftHalf[i] <= rightHalf[j]) {
    			inputArray[k] = leftHalf[i];
    			i++;
    		}
    		else {
    			inputArray[k] = rightHalf[j];
    			j++;
    		}
    		k++;
    	}

    	// Copy any remaining elements from leftHalf
    	while (i < leftSize) {
    		inputArray[k] = leftHalf[i];
    		i++;
    		k++;
    	}

    	// Copy any remaining elements from rightHalf
    	while (j< rightSize) {
    		inputArray[k] = rightHalf[j];
    		j++;
    		k++;
    	}

    }

    // Print all elements of array.
    private static void printArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i]);
    	}
    }
}
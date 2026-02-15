/**
 * This class contains the build max heap method that heapifies from
 * the last non-leaf node at index [n/2] - 1 and moves upward to the
 * root. 
 */
public class MaxHeapWordFreq {

	public static void main(String[] args) {
		// Build a WordFreq array that contains commonly used 
		// customer‑survey phrases, each paired with the number 
		// of times it appeared in recent feedback.
		WordFreq[] arr = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };

        // Convert the array into a max heap
        buildMaxHeap(arr);

        // Print the heapified array
        System.out.println("Heapified array:");
        for (WordFreq wf : arr) {
            System.out.println(wf);
        }
	}

	// Build Max Heap procedure
	// Starts the heapifying from the last non-leaf node 
	// and moves upward to the root
	static void buildMaxHeap(WordFreq[] arr) {
		// Last non-leaf node is at index (n/2) - 1
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, arr.length, i);
        }
    }

    // Ensures the subtree rooted at index i satisfies
    // the max-heap property.
    static void maxHeapify(WordFreq[] arr, int heapSize, int i) {
        
    	// The current node is the largest
        int largest = i;
        
        // Calculate indices of left and right children
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Compare left child with current largest
        if (left < heapSize &&
            arr[left].frequency > arr[largest].frequency) {
            largest = left;
        }

        // Compare right child with current largest
        if (right < heapSize &&
            arr[right].frequency > arr[largest].frequency) {
            largest = right;
        }

        // If the largest is not the current node, swap and recure
        if (largest != i) {
            swap(arr, i, largest);
            // Recursively heapify the affected subtree
            maxHeapify(arr, heapSize, largest);
        }
    }

    // Swaps two elements in an array
    static void swap(WordFreq[] arr, int i, int j) {
        WordFreq temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

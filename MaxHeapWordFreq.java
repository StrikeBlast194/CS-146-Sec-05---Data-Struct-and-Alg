/**
 * This class contains the build max heap method that heapifies from
 * the last non-leaf node at index [n/2] - 1 and moves upward to the
 * root. 
 */
public class MaxHeapWordFreq {

	public static void main(String[] args) {
		// build a WordFreq array that contains commonly used 
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

        buildMaxHeap(arr);

        System.out.println("Heapified array:");
        for (WordFreq wf : arr) {
            System.out.println(wf);
        }
	}
}

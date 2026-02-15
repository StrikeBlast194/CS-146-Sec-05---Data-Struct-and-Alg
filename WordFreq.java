/**
 * This class is used as the element stored in the max-heap.
 */ 

class WordFreq {
	String word;
	int frequency;

	// Constructor to initialize the phrase and its frequency.
	public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }
    // Converts the object to a readable string format.
    @Override
    public String toString() {
        return "(" + word + ", " + frequency + ")";
    }
}

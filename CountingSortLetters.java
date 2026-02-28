public class CountingSortLetters {

    public static void main(String[] args) {

        // Input array containing uppercase letters A–Z
        char[] input = {'A', 'A', 'Z', 'B', 'H', 'K', 'L', 'Z', 'W', 'X', 'P'};

        // Call counting sort function
        countingSort(input);
    }

    /**
     * This method sorts an array of uppercase letters (A–Z)
     * using the Counting Sort algorithm.
     */
    public static void countingSort(char[] arr) {

        // Step 1: Create frequency array of size 26
        // Each index represents a letter:
        // index 0 -> 'A', index 1 -> 'B', ..., index 25 -> 'Z'
        int[] count = new int[26];

        // Step 2: Count the frequency of each character
        for (char c : arr) {
            // Convert character to index (A = 0, B = 1, ..., Z = 25)
            count[c - 'A']++;
        }

        // Print frequency array
        System.out.println("Frequency Array:");
        printArray(count);

        // Step 3: Convert frequency array to cumulative count array
        // Each element now contains the total number of elements
        // less than or equal to the current character
        for (int i = 1; i < 26; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Print cumulative count array
        System.out.println("\nCumulative Count Array:");
        printArray(count);

        // Step 4: Create output array to store sorted result
        char[] output = new char[arr.length];

        // Step 5: Build the sorted output array
        // Traverse input from right to left to maintain stability
        for (int i = arr.length - 1; i >= 0; i--) {

            char currentChar = arr[i];

            // Determine correct position of current character
            int position = count[currentChar - 'A'] - 1;

            // Place character at calculated position
            output[position] = currentChar;

            // Decrease count to handle duplicate characters
            count[currentChar - 'A']--;
        }

        // Step 6: Print final sorted array
        System.out.println("\nSorted Output:");
        for (char c : output) {
            System.out.print(c + " ");
        }
    }

    /**
     * Utility method to print an integer array
     */
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
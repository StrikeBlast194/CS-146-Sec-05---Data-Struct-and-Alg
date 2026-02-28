/**
 * 
 */ 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTSearch {
	// 
	public static List<Integer> bstSearchTrace(TreeNode root, Integer k) {
		
		// Base case: reached a null subtree
		if (root == null) {
			return new ArrayList<>();
		}

		// Create a new trace list for searching for a node
		List<Integer> trace = new ArrayList<>();
		trace.add(root.key);

		//If key is found, stop recursion
		if (root.key == k) {
			return trace;
		}

		// Recursive search
		if (k < root.key) {
			trace.addAll(bstSearchTrace(root.left, k));
		}
		else {
			trace.addAll(bstSearchTrace(root.right, k));
		} 
		return trace;
	}

	// Main driver to testing

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);

		root.left = new TreeNode(6);
		root.right = new TreeNode(16);

		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(10);

		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(7);

		root.right.right = new TreeNode(17);
		root.right.right.right = new TreeNode(19);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter search key: ");
		int searchKey = scanner.nextInt();

		List<Integer> trace = bstSearchTrace(root, searchKey);

		boolean found = !trace.isEmpty() && trace.get(trace.size() - 1) == searchKey;

		System.out.println("Search key: " + searchKey);
		System.out.println("Search trace: " + trace);
		System.out.println("Key found? " + found);

		scanner.close();
	}
}
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BSTSearchTest {

    private TreeNode buildBST() {
        TreeNode root = new TreeNode(15);

        root.left = new TreeNode(6);
        root.right = new TreeNode(18);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(17);
        root.right.right = new TreeNode(20);

        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);

        root.left.right.right = new TreeNode(13);
        root.left.right.right.left = new TreeNode(9);

        return root;
    }

    @Test
    public void testKeyFound() {
        TreeNode root = buildBST();
        List<Integer> trace = BSTSearch.bstSearchTrace(root, 13);
        assertEquals(List.of(15, 6, 7, 13), trace);
    }

    @Test
    public void testKeyNotFound() {
        TreeNode root = buildBST();
        List<Integer> trace = BSTSearch.bstSearchTrace(root, 14);
        assertEquals(List.of(15, 6, 7, 13), trace);
    }

    @Test
    public void testSearchRoot() {
        TreeNode root = buildBST();
        List<Integer> trace = BSTSearch.bstSearchTrace(root, 15);
        assertEquals(List.of(15), trace);
    }

    @Test
    public void testEmptyTree() {
        List<Integer> trace = BSTSearch.bstSearchTrace(null, 10);
        assertEquals(List.of(), trace);
    }
}
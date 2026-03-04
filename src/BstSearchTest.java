import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    // Test 1: Empty tree (null root) returns false
    @Test
    public void testWhenRootIsNull() {
        assertFalse(BstSearch.contains(null, 5));
    }

    // Test 2: Single-node tree, target matches root
    @Test
    public void testSingleNode_ContainsTarget() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        assertTrue(BstSearch.contains(root, 10));
    }

    // Test 3: Single-node tree, target not present
    @Test
    public void testSingleNode_WhenNotContainsTarget() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        assertFalse(BstSearch.contains(root, 99));
    }
    
     // Test 4: Target found in left subtree
    @Test
    public void testWhenTargetIsInLeftSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(9);
        assertTrue(BstSearch.contains(root, 9));
    }


    // Test 5: Target found in right subtree
    @Test
    public void testWhenTargetIsInRightSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.right = new BinaryTreeNode<>(11);
        assertTrue(BstSearch.contains(root, 11));
    }


    // Test 6: Target not found in left subtree
    @Test
    public void testWhenTargetIsNotInLeftSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(9);
        assertFalse(BstSearch.contains(root, 7));
    }


    // Test 7: Target not found in right subtree
    @Test
    public void testWhenTargetIsNotInRightSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.right = new BinaryTreeNode<>(11);
        assertFalse(BstSearch.contains(root, 15));
    }
   

}

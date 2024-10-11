package bits;

import bits.CountCompleteTreeNodes.CountCompleteTreeNodes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import common.TreeNode;

public class CountCompleteTreeNodesTest {
    CountCompleteTreeNodes completeTreeNodes = new CountCompleteTreeNodes();

    /**
     * Test case 1: Complete binary tree with 6 nodes
     *
     * The tree structure is as follows:
     *          1
     *         / \
     *        2   3
     *       / \  /
     *      4   5 6
     *
     * Expected output: 6 (there are 6 nodes in this tree)
     */
    @Test
    void testCountNodesWithSixNodes() {
        // Create the binary tree structure
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));

        int expected = 6;
        assertEquals(expected, completeTreeNodes.countNodes(root));
    }

    /**
     * Test case 2: Empty tree
     *
     * The tree structure is null (no nodes).
     *
     * Expected output: 0 (there are no nodes in this tree)
     */
    @Test
    void testCountNodesWithEmptyTree() {
        TreeNode root = null; // No nodes in the tree

        int expected = 0;
        assertEquals(expected, completeTreeNodes.countNodes(root));
    }

    /**
     * Test case 3: Single node tree
     *
     * The tree structure is just one node:
     *      1
     *
     * Expected output: 1 (there is only 1 node in this tree)
     */
    @Test
    void testCountNodesWithSingleNode() {
        TreeNode root = new TreeNode(1); // Single root node

        int expected = 1;
        assertEquals(expected, completeTreeNodes.countNodes(root));
    }

    /**
     * Test case 4: Complete binary tree with 4 nodes
     *
     * The tree structure is as follows:
     *        1
     *       / \
     *      2   3
     *     /
     *    4
     *
     * Expected output: 4 (there are 4 nodes in this tree)
     */
    @Test
    void testCountNodesWithFourNodes() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));

        int expected = 4;
        assertEquals(expected, completeTreeNodes.countNodes(root));
    }
}

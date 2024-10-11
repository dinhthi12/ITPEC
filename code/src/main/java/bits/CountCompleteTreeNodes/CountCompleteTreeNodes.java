package bits.CountCompleteTreeNodes;

// https://leetcode.com/problems/count-complete-tree-nodes


import common.TreeNode;

/**
 * Time and Space Complexity:
 *
 * Time Complexity:
 * O(n) - where n is the number of nodes in the tree. The function visits each node once.
 *
 * Space Complexity:
 * O(log n) - in the best case (balanced tree, due to recursive call stack depth)
 * O(n) - in the worst case (unbalanced tree, where the call stack depth could equal the number of nodes).
 *
 * Key words: Tree, Binary Tree, Recursion.
 */
public class CountCompleteTreeNodes {
    /**
     * This method counts the number of nodes in a complete binary tree.
     *
     * @param root the root node of the binary tree
     * @return the total number of nodes in the tree
     */
    public int countNodes(TreeNode root) {

        /**
         * Base case: if the root is null, return 0 (no nodes in the tree)
         */
        if (root == null) {
            return 0;
        }

        /**
         * Recursive case:
         * 1 (count the current node) + count the nodes in the left subtree + count the nodes in the right subtree
         */
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

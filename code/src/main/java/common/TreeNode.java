package common;

public class TreeNode {
    /**
     * The value stored in this node of the tree
     */
    public int val;

    /**
     * Pointers to the left and right children of this node
     */
    public TreeNode left;  // Points to the left child (null if no child)
    public TreeNode right; // Points to the right child (null if no child)

    /**
     * Default constructor, initializes an empty node with no value or children
     */

    public TreeNode() {}

    /**
     * Constructor to initialize a node with a given value
     */
    public TreeNode(int val) {
        this.val = val; // Set the node's value to the passed integer
    }

    /**
     * Constructor to initialize a node with a given value and specific left and right children
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;         // Set the node's value
        this.left = left;       // Assign the left child node
        this.right = right;     // Assign the right child node
    }
}

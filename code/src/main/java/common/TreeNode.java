package common;

public class TreeNode {
    /**
     * The value stored in the node. This represents the data contained in this particular tree node.
     */
    public int val;

    /**
     * The reference to the left child node in the binary tree.
     * If there is no left child, this will be `null`.
     */
    public TreeNode left;

    /**
     * The reference to the right child node in the binary tree.
     * If there is no right child, this will be `null`.
     */
    public TreeNode right;

    /**
     * Default constructor that creates an empty TreeNode.
     * Both `left` and `right` child references are initialized to `null`, and `val` is uninitialized.
     */
    public TreeNode() {}

    /**
     * Constructor that creates a TreeNode with a specified value.
     * The `left` and `right` child references are initialized to `null`.
     *
     * @param val The value to be stored in the node.
     */
    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * Constructor that creates a TreeNode with a specified value, left child, and right child.
     *
     * @param val The value to be stored in the node.
     * @param left The reference to the left child node.
     * @param right The reference to the right child node.
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

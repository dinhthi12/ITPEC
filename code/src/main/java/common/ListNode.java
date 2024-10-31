package common;

public class ListNode {
    /**
     * The value stored in the node. This represents the data contained in this particular node.
     */
    public int val;

    /**
     * Reference to the next node in the linked list. If this is the last node, `next` will be `null`.
     */
    public ListNode next;

    /**
     * Default constructor that creates an empty ListNode. Both `val` and `next` are initialized to default values.
     */
    public ListNode() {}

    /**
     * Constructor that creates a ListNode with a given value.
     * The `next` pointer is initialized to `null`.
     *
     * @param val The value to be stored in the node.
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * Constructor that creates a ListNode with a given value and a reference to the next node.
     *
     * @param val The value to be stored in the node.
     * @param next The next node in the linked list.
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

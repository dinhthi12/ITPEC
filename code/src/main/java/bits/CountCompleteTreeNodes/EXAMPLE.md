## Example

**Input:**  
- Tree: [1,2,3,4,5,6]

**Process:**
- The recursive function traverses the tree and counts each node:
    - `countNodes(1)` calls `countNodes(2)` and `countNodes(3)`.
    - `countNodes(2)` calls `countNodes(4)` and `countNodes(5)`, and so on.
- Each node contributes to the total count.

**Output:**  
- Total number of nodes = 6
# Example :

**Input:**  
`n = 00000010100101000001111010011100` (in binary)

**Process:**
1. Initialize `result = 0`.
2. For each bit in `n` (from rightmost to leftmost), shift `result` left and append the current bit from `n`.
    - Step 1: result = `0`, shift left → `0`, append current bit `0`.
    - Step 2: result = `0`, shift left → `0`, append current bit `1`, result → `1`.
    - Step 3: Continue this process for all 32 bits.

**Output:**  
`result = 00111001011110000010100101000000` (in binary) The decimal value is `964176192`.
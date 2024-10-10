# Example

## Example 1:
**Input:**  
n = 11 (binary: `00000000000000000000000000001011`)

**Process:**
- Iterate over all 32 bits of `n`.
- For each bit, check if it's `1` using `(n >> i) & 1`.
- Count how many `1`s are found.

**Output:**  
3 (There are 3 `1` bits in the binary representation of `11`).

---

## Example 2:
**Input:**  
n = 128 (binary: `00000000000000000000000010000000`)

**Process:**
- Iterate over all 32 bits of `n`.
- Only one `1` bit is found at position 7 (starting from 0).

**Output:**  
1 (There is 1 `1` bit in the binary representation of `128`).

---

## Example 3:
**Input:**  
n = 4294967293 (binary: `11111111111111111111111111111101`)

**Process:**
- Iterate over all 32 bits of `n`.
- Count each `1` bit in the binary representation.

**Output:**  
31 (There are 31 `1` bits in the binary representation of `4294967293`).

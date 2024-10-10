# Number Of 1 Bits Explanation

## Initialize:
- Initialize a variable `result` to `0` which will store the count of '1' bits.

## Algorithm:
1. Loop through all 32 bits of the input integer `n`:
    - In each iteration, check if the least significant bit (LSB) of `n` (i.e., the `i`-th bit) is `1`.
    - Perform a right shift on `n` by `i` bits (`n >> i`) and use the bitwise AND operation (`& 1`) to check the value of the current bit.
    - If the result of `(n >> i) & 1` is `1`, increment the `result` counter.

## Return the Result:
- After iterating through all 32 bits of the integer, return the `result` which contains the count of '1' bits in the input.

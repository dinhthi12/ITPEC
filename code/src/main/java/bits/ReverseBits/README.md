# Reverse Bits Explanation

## Initialize:
1. Initialize a result variable to `0` which will store the reversed bits.

## Algorithm:
2. Loop 32 times (since the input is a 32-bit unsigned integer).

3. During each iteration:
    - Left shift the `result` by 1 to make space for the next bit.
    - If the current least significant bit (LSB) of `n` is 1, set the LSB of `result` to 1.
    - Right shift the input number `n` by 1 to move the next bit into the LSB position.

## Return the Result:
- After processing all the bits, return the `result` which now contains the reversed bits.

# Power of Two

## Problem Description:
Given an integer `n`, write a function that determines if it is a power of two. A number `n` is a power of two if it can be expressed as `2^x` where `x` is a non-negative integer.

## Initialize:
- The function `isPowerOfTwo` is called with an integer `n`.
- If `n` is 0, return `false` immediately, as 0 is not a power of two.

## Algorithm:
1. Use a **while loop** to repeatedly check if `n` is divisible by 2:
    - If `n % 2 != 0` at any point, return `false` because the number is not a power of two.
    - Divide `n` by 2 for the next iteration of the loop.
2. If `n` eventually becomes 1, return `true`, as that means the number was repeatedly divisible by 2 and is thus a power of two.

## Return the Result:
- If the loop exits successfully (i.e., `n` becomes 1), return `true` as the number is a power of two.
- If the number is not divisible by 2 at any point, or if `n` is negative or zero, return `false`.
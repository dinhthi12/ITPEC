# Single Number Explanation

## Initialize:
- Initialize `result` to `0`. This will store the cumulative XOR value of all elements in the array.

## Traverse the Array:
- For each element `num` in the array:
    - XOR `result` with `num`: `result = result ^ num`
    - This operation effectively cancels out any numbers that appear twice and keeps the number that appears once.

## Return the Result:
- Once all elements in the array have been processed `result` will hold the number that appears only once in the array.

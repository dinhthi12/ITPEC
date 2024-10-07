# Example

## Initial Values:
- `a = "111"`, `b = "11"`
- `i = 2`, `j = 1`, `carry = 0`

## First Iteration (Rightmost Bits):
- `a[2] = 1`, `b[1] = 1`
- `carry = 1 + 1 = 2`
    - Append `carry % 2 = 0`
    - Update `carry = 2 / 2 = 1`
- `stringBuilder = "0"`

## Second Iteration (Next Bits):
- `a[1] = 1`, `b[0] = 1`
- `carry = 1 + 1 + 1 = 3`
    - Append `carry % 2 = 1`
    - Update `carry = 3 / 2 = 1`
- `stringBuilder = "10"`

## Third Iteration (Leftmost Bits):
- `a[0] = 1`, `b` has no more bits (`j < 0`)
- `carry = 1 + 1 = 2`
    - Append `carry % 2 = 0`
    - Update `carry = 2 / 2 = 1`
- `stringBuilder = "010"`

## Final Iteration (Only Carry Left):
- Both `a` and `b` have no more bits (`i < 0`, `j < 0`), but `carry = 1`
- Append `carry % 2 = 1`
    - Update `carry = 1 / 2 = 0`
- `stringBuilder = "1010"`

## Result:
After the loop ends, reverse `stringBuilder` and return `"1010"`, which is the correct sum of `111` and `11` in binary.

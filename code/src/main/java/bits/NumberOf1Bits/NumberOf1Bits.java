package bits.NumberOf1Bits;

// https://leetcode.com/problems/number-of-1-bits/

/**
 * Time and Space Complexity:
 *
 * Time Complexity:
 * O(1) - the number of bits in the integer is constant.
 *
 * Space Complexity:
 * O(1) - no extra space is used that grows with the input size.
 *
 * Key words: Hamming weight, Bit manipulation.
 */

public class NumberOf1Bits {
    /**
     * Function to calculate the number of '1' bits (Hamming weight) in a 32-bit integer.
     *
     * @param {Integer} n
     * @return {Integer}
     */
    public int hammingWeight(int n) {
        /**
         * Initialize result variable to store the count of '1' bits.
         */
        int result = 0;

        /**
         * Iterate over all 32 bits of the input integer.
         * We use a bitwise right shift to check each bit of the integer one by one.
         */
        for (int i = 0; i < 32; i++) {
            /**
             * Check if the current bit (at position i) is '1'.
             * Perform a right shift on 'n' by 'i' bits and check if the least significant bit (LSB) is 1.
             */
            if (((n >> i) & 1) == 1) {
                /**
                 * If the current bit is '1', increment the result counter.
                 */
                result += 1;
            }
        }

        /**
         * Return the total count of '1' bits in the integer.
         */
        return result;
    }
}

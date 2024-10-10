package bits.ReverseBits;

// https://leetcode.com/problems/reverse-bits/

/**
 * Time and Space Complexity:
 *
 * Time Complexity:
 *  O(1) - The loop runs exactly 32 iterations, regardless of the input.
 *
 * Space Complexity:
 * O(1) - Only a few extra variables are used (result, i), so the space complexity is constant.
 *
 * Key words: Left shift, Bitwise OR.
 */

public class ReverseBits {

    /**
     * This method takes a 32-bit integer `n` as input and returns the integer
     * that results from reversing the bits of `n`.
     *
     * @param {Integer} n
     * @return {Integer}
     */
    public int reverseBits(int n) {
        /**
         * Initialize the result to store the reversed bits.
         */
        int result = 0;

        /**
         * Loop through all 32 bits of the input number.
         */
        for (int i = 0; i < 32; i++) {
            /**
             * Left shift the result by 1 bit to make room for the next bit.
             */
            result <<= 1;

            /**
             * Check if the current least significant bit (LSB) of 'n' is 1.
             */
            if ((n & 1) == 1) {
                /**
                 * If the LSB is 1, set the LSB of the result to 1.
                 */
                result |= 1;
            }

            /**
             * Right shift the input 'n' by 1 to process the next bit in the next iteration.
             * Use unsigned shift (>>>) to ensure no sign propagation.
             */
            n >>>= 1;
        }

        /**
         * Return the final reversed bit representation.
         */
        return result;
    }
}

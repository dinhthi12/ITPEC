package bits.AddBinary;

// https://leetcode.com/problems/add-binary/

/**
 * Time and Space Complexity:
 * Time Complexity:
 *
 * The time complexity is O(max(m, n)), where m and n are the lengths of the binary strings a and b, respectively.
 * This is because we process both strings from right to left.
 *
 * Space Complexity:
 *
 * The space complexity is O(max(m, n)) due to the space needed to store the resulting binary string in the StringBuilder.
 *
 * key word: Implicit Type Promotion
 */

public class AddBinary {

    /**
     * Method to add two binary strings and return their sum as a binary string
     * */
    public String addBinary(String a, String b) {
        /**
         * Initialize pointers for both strings starting from the last character (rightmost bit)
         */
        int i = a.length() - 1; // Pointer for string 'a'
        int j = b.length() - 1; // Pointer for string 'b'

        /**
         * Variable to store the carry from the addition of two bits
         */
        int carry = 0;

        /**
         * StringBuilder to construct the result binary string (from right to left)
         */
        StringBuilder stringBuilder = new StringBuilder();

        /**
         * Loop through both strings and the carry until both strings are fully processed
         */
        while (i >= 0 || j >= 0 || carry == 1) {
            /**
             * Add the current bit from string 'a' to carry, if i >= 0
             */
            if (i >= 0) {
                carry += a.charAt(i--) - '0'; // Convert 'char' to 'int' by subtracting ASCII value of '0'
            }

            /**
             * Add the current bit from string 'b' to carry, if j >= 0
             */
            if (j >= 0) {
                carry += b.charAt(j--) - '0'; // Convert 'char' to 'int' by subtracting ASCII value of '0'
            }

            /**
             * Append the result of (carry % 2) to the result, which is the current bit (either 0 or 1)
             */

            stringBuilder.append(carry % 2);

            /**
             * Update carry for the next iteration (either 0 or 1) by dividing carry by 2
             */
            carry /= 2;
        }

        /**
         * Reverse the result string since we built it from right to left, and return it
         */
        return stringBuilder.reverse().toString();
    }
}

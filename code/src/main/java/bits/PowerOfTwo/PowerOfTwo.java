package bits.PowerOfTwo;

// https://leetcode.com/problems/power-of-two/

/**
 * Time and Space Complexity:
 *
 * Time Complexity:
 * O(log n) - because the number is divided by 2 in each iteration.
 *
 * Space Complexity:
 * O(1) - as no additional space is used apart from a few variables.
 *
 * Key words: Power of Two, Bit Manipulation.
 */
public class PowerOfTwo {

    /**
     * Method to check if a given number is a power of two.
     *
     * @param n The input integer.
     * @return True if n is a power of two, false otherwise.
     */
    public boolean isPowerOfTwo(int n) {
        // Special case: 0 is not a power of two.
        if (n == 0) {
            return false;
        }

        // Loop until the number is reduced to 1 (i.e., the number is a power of two).
        while (n != 1) {
            // If n is not divisible by 2, it can't be a power of two.
            if (n % 2 != 0) {
                return false;
            }

            // Divide the number by 2 in each iteration.
            n /= 2;
        }

        // If n becomes 1, it means the original number was a power of two.
        return true;
    }
}

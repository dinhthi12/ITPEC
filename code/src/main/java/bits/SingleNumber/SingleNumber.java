package bits.SingleNumber;

// https://leetcode.com/problems/single-number/

/**
 * Time and Space Complexity:
 * Time Complexity:
 *
 * O(n) - We traverse the array once, so the time complexity is linear.
 *
 * Space Complexity:
 *
 * O(1) - We use a constant amount of space regardless of the input size.
 *
 * Key word: XOR, bitwise manipulation
 */

public class SingleNumber {

    /**
     * This method finds the single number in an array where every element appears twice except for one.
     * It uses the XOR bitwise operator to cancel out duplicate numbers.
     *
     * @param {Integer[]} nums
     * @return {Integer}
     */
    public int singleNumber(int[] nums){
        /**
         * Initialize result to 0 because XOR-ing with 0 leaves the number unchanged
         */
        int result = 0;

        /**
         * Traverse the array, XOR-ing each element with result
         */
        for (int i = 0; i < nums.length; i++){
            result = result ^ nums[i]; // XOR current number with result
        }

        /**
         * The result will be the number that appears only once
         */
        return result;
    }
}

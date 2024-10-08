package bits;

import bits.SingleNumber.SingleNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleNumberTest {

    @Test
    void testSingleNumber() {

        // Instantiate the SingleNumber class
        SingleNumber singleNumber = new SingleNumber();

        // Test case 1: Array with the number 1 being the single number
        int[] nums1 = {2, 2, 1};
        int expected1 = 1; // The number 1 appears only once
        assertEquals(expected1, singleNumber.singleNumber(nums1)); // Assert the expected result

        // Test case 2: Array with the number 4 being the single number
        int[] nums2 = {4, 1, 2, 1, 2};
        int expected2 = 4; // The number 4 appears only once
        assertEquals(expected2, singleNumber.singleNumber(nums2)); // Assert the expected result
    }

    /**
     * Additional test case: Single element in the array
     */
    @Test
    void testSingleNumberWithSingleElement() {
        // Test case with only one element in the array
        int[] nums = {7};
        int expected = 7; // The number 7 is the only number in the array
        assertEquals(expected, SingleNumber.singleNumber(nums)); // Assert the expected result
    }

    /**
     * Additional test case: Larger array with various duplicates
     */
    @Test
    void testSingleNumberWithLargeArray() {
        // Test case with a larger array where 9 is the single number
        int[] nums = {5, 3, 5, 3, 9};
        int expected = 9; // The number 9 appears only once
        assertEquals(expected, SingleNumber.singleNumber(nums)); // Assert the expected result
    }
}

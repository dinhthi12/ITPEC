package bits;

import bits.SingleNumber.SingleNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    /**
     * Additional test case: Small array with various duplicates
     */
    @Test
    void testSingleNumber() {
        int[] nums = {2, 2, 1};
        int expected = 1; // The number 1 appears only once
        assertEquals(expected, singleNumber.singleNumber(nums)); // Assert the expected result
    }

    /**
     * Additional test case: Single element in the array
     */
    @Test
    void testSingleNumberWithSingleElement() {
        int[] nums = {7};
        int expected = 7; // The number 7 is the only number in the array
        assertEquals(expected, singleNumber.singleNumber(nums)); // Assert the expected result
    }

    /**
     * Additional test case: Larger array with various duplicates
     */
    @Test
    void testSingleNumberWithLargeArray() {
        int[] nums = {5, 3, 5, 3, 9};
        int expected = 9; // The number 9 appears only once
        assertEquals(expected, singleNumber.singleNumber(nums)); // Assert the expected result
    }
}

package bits;

import bits.PowerOfTwo.PowerOfTwo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {
    PowerOfTwo powerOfTwo = new PowerOfTwo();

    /**
     * Test case 1: Check for the smallest power of two (n = 1).
     * Expected result: true, because 1 is 2^0, which is a power of two.
     */
    @Test
    void testPowerOfTwoOne() {
        int n = 1;
        boolean expected = true;
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }

    /**
     * Test case 2: Check for a larger power of two (n = 16).
     * Expected result: true, because 16 is 2^4, which is a power of two.
     */
    @Test
    void testPowerOfTwoSixteen() {
        int n = 16;
        boolean expected = true;
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }

    /**
     * Test case 3: Check for a non-power of two (n = 3).
     * Expected result: false, because 3 is not a power of two.
     */
    @Test
    void testNotPowerOfTwo() {
        int n = 3;
        boolean expected = false;
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }

    /**
     * Test case 4: Check for zero input (n = 0).
     * Expected result: false, because 0 is not a power of two.
     */
    @Test
    void testZero() {
        int n = 0;
        boolean expected = false;
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }

    /**
     * Test case 5: Check for negative input (n = -16).
     * Expected result: false, because negative numbers are not powers of two.
     */
    @Test
    void testNegativeNumber() {
        int n = -16;
        boolean expected = false;
        assertEquals(expected, powerOfTwo.isPowerOfTwo(n));
    }
}

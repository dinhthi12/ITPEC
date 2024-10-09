package bits;

import bits.ReverseBits.ReverseBits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseBitsTest {
    ReverseBits reverseBits = new ReverseBits();

    /**
     * Additional test case: Test for a typical 32-bit number
     */
    @Test
    void testReverseBitsExampleCase() {
        int n = 0b00000010100101000001111010011100;
        int expected = 0b00111001011110000010100101000000; // Expected result after reversing bits
        assertEquals(expected, reverseBits.reverseBits(n));
    }

    /**
     * Additional test case: Test for a number with alternating bits
     */
    @Test
    void testReverseBitsAlternatingBits() {
        int n = 0b01010101010101010101010101010101;
        int expected = 0b10101010101010101010101010101010; // Expected reversed bits
        assertEquals(expected, reverseBits.reverseBits(n));
    }

    /**
     * Additional test case: Test for all bits set to 1
     */
    @Test
    void testReverseBitsAllOnes() {
        int n = 0b11111111111111111111111111111111;
        int expected = 0b11111111111111111111111111111111; // Reversing all 1s is still all 1s
        assertEquals(expected, reverseBits.reverseBits(n));
    }

    /**
     * Additional test case: Test for a number with leading zeros
     */
    @Test
    void testReverseBitsLeadingZeros() {
        int n = 0b00000000000000000000000000000101;
        int expected = 0b10100000000000000000000000000000; // Reverse leading zeros
        assertEquals(expected, reverseBits.reverseBits(n));
    }

    /**
     * Additional test case: Test for zero input
     */
    @Test
    void testReverseBitsZeroInput() {
        int n = 0;
        int expected = 0; // Reversing 0 remains 0
        assertEquals(expected, reverseBits.reverseBits(n));
    }
}

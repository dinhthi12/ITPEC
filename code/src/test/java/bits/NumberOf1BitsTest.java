package bits;

import bits.NumberOf1Bits.NumberOf1Bits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    /**
     * Additional test case: Typical case with multiple 1-bits.
     */
    @Test
    void testHammingWeightMultipleOnes() {
        int n = 0b00000000000000000000000000001011; // Binary for 11
        int expected = 3; // 3 bits set to 1
        assertEquals(expected, numberOf1Bits.hammingWeight(n));
    }

    /**
     * Additional test case: Edge case with all bits set to 0.
     */
    @Test
    void testHammingWeightAllZeros() {
        int n = 0b00000000000000000000000000000000; // Binary for 0
        int expected = 0; // No bits set to 1
        assertEquals(expected, numberOf1Bits.hammingWeight(n));
    }

    /**
     * Additional test case: Edge case with a single 1-bit.
     */
    @Test
    void testHammingWeightSingleOne() {
        int n = 0b00000000000000000000000010000000; // Binary for 128
        int expected = 1; // Only 1 bit set to 1
        assertEquals(expected, numberOf1Bits.hammingWeight(n));
    }

    /**
     * Additional test case: Large number with many bits set to 1.
     */
    @Test
    void testHammingWeightLargeNumber() {
        int n = 0b11111111111111111111111111111101; // Binary for 4294967293
        int expected = 31; // 31 bits set to 1
        assertEquals(expected, numberOf1Bits.hammingWeight(n));
    }

    /**
     * Additional test case: Case with alternating bits.
     */
    @Test
    void testHammingWeightAlternatingBits() {
        int n = 0b01010101010101010101010101010101; // Alternating bits
        int expected = 16; // 16 bits set to 1
        assertEquals(expected, numberOf1Bits.hammingWeight(n));
    }
}

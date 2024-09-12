package bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimumBitFlipsToConvertNumberTest {

    @Test
    void testMinBitFlips() {
        MinimumBitFlipsToConvertNumber converter = new MinimumBitFlipsToConvertNumber();

        // Test case 1: Start = 10, Goal = 7
        int start1 = 10;
        int goal1 = 7;
        int expected1 = 3; // Binary 1010 to 0111 requires 3 flips
        assertEquals(expected1, converter.minBitFlips(start1, goal1));

        // Test case 2: Start = 0, Goal = 0
        int start2 = 0;
        int goal2 = 0;
        int expected2 = 0; // No flips needed
        assertEquals(expected2, converter.minBitFlips(start2, goal2));

        // Test case 3: Start = 1, Goal = 2
        int start3 = 1;
        int goal3 = 2;
        int expected3 = 2; // Binary 0001 to 0010 requires 2 flips
        assertEquals(expected3, converter.minBitFlips(start3, goal3));

        // Test case 4: Start = 15, Goal = 0
        int start4 = 15;
        int goal4 = 0;
        int expected4 = 4; // Binary 1111 to 0000 requires 4 flips
        assertEquals(expected4, converter.minBitFlips(start4, goal4));
    }
}

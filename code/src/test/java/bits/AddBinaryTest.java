package bits;

import bits.AddBinary.AddBinary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit test for AddBinary class that tests the addBinary method
public class AddBinaryTest {

    @Test
    void testAddBinary() {
        // Create an instance of the AddBinary class
        AddBinary addBinary = new AddBinary();

        // Test case 1: Adding "11" and "1"
        // Binary "11" is 3 and "1" is 1 in decimal, so their sum is 4, which is "100" in binary
        String a1 = "11";
        String b1 = "1";
        String expected1 = "100";
        // Assert that the result of addBinary(a1, b1) is "100"
        assertEquals(expected1, addBinary.addBinary(a1, b1));

        // Test case 2: Adding "1010" and "1011"
        // Binary "1010" is 10 and "1011" is 11 in decimal, so their sum is 21, which is "10101" in binary
        String a2 = "1010";
        String b2 = "1011";
        String expected2 = "10101";
        // Assert that the result of addBinary(a2, b2) is "10101"
        assertEquals(expected2, addBinary.addBinary(a2, b2));

        // Test case 3: Adding "111" and "11"
        // Binary "111" is 7 and "11" is 3 in decimal, so their sum is 10, which is "1010" in binary
        String a3 = "111";
        String b3 = "11";
        String expected3 = "1010";
        // Assert that the result of addBinary(a3, b3) is "1010"
        assertEquals(expected3, addBinary.addBinary(a3, b3));
    }
}

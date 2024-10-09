package bits;

import bits.AddBinary.AddBinary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    void testAddBinary() {
        // Test case 1: Adding two simple binary numbers "1010" + "1011"
        String a1 = "1010";
        String b1 = "1011";
        String expected1 = "10101";
        assertEquals(expected1, addBinary.addBinary(a1, b1));

        // Test case 2: Adding two binary numbers with different lengths "110" + "10"
        String a2 = "110";
        String b2 = "10";
        String expected2 = "1000";
        assertEquals(expected2, addBinary.addBinary(a2, b2));

        // Test case 3: Adding binary numbers where both are "0"
        String a3 = "0";
        String b3 = "0";
        String expected3 = "0";
        assertEquals(expected3, addBinary.addBinary(a3, b3));

        // Test case 4: Adding binary number with itself "1" + "1"
        String a4 = "1";
        String b4 = "1";
        String expected4 = "10";
        assertEquals(expected4, addBinary.addBinary(a4, b4));

        // Test case 5: Adding binary numbers with many carries "1111" + "1"
        String a5 = "1111";
        String b5 = "1";
        String expected5 = "10000";
        assertEquals(expected5, addBinary.addBinary(a5, b5));
    }
}

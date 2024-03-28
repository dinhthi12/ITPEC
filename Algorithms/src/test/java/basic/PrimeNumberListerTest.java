package basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberListerTest {
    @Test
    public void testListPrimes() {
        int n = 20;
        String expected = "Prime numbers less than 20 are:\n2 3 5 7 11 13 17 19 \n";
        assertEquals(expected, getOutput(n));
    }

    // Helper function to get the output of listPrimes
    private String getOutput(int n) {
        ByteArrayOutputStream ByteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ByteArrayOutputStream);
        System.setOut(ps);
        PrimeNumberLister.listPrimes(n);
        System.setOut(System.out);
        return ByteArrayOutputStream.toString();
    }
}

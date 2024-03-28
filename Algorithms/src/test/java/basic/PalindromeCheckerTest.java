package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindromeUsingMath() {
        assertTrue(PalindromeNumber.isPalindrome(121));
        assertTrue(PalindromeNumber.isPalindrome(12321));
        assertTrue(PalindromeNumber.isPalindromeC2(1221));
        assertFalse(PalindromeNumber.isPalindromeC2(123));
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }
}

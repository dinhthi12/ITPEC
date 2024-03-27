package algorithms.basic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

	@Test
	public void testIsPalindromeUsingIndexC1() {
		assertTrue(Palindrome.isPalindrome(121));
		assertFalse(Palindrome.isPalindrome(10));
		assertTrue(Palindrome.isPalindrome(1221));
		assertFalse(Palindrome.isPalindrome(123));
		assertFalse(Palindrome.isPalindrome(-121));
	}

	@Test
	public void testIsPalindromeUsingIndexC2() {
		assertTrue(Palindrome.isPalindromeC2(121));
		assertTrue(Palindrome.isPalindromeC2(1221));
		assertFalse(Palindrome.isPalindromeC2(123));
		assertFalse(Palindrome.isPalindromeC2(-121));
	}

}

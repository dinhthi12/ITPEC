package algorithms.basic;

public class Palindrome {
	// c1
	public static boolean isPalindrome(int x) {

		String strNumber = String.valueOf(x);

		int left = 0;
		int right = strNumber.length() - 1;

		while (left < right) {
			if (strNumber.charAt(left) != strNumber.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static boolean isPalindromeC2(int x) {
		if (x < 0) {
			return false;
		}

		int reversedNumber = 0;
		int originalNumber = x;

		while (x != 0) {
			int digit = x % 10;
			reversedNumber = reversedNumber * 10 + digit;
			x /= 10;
		}

		return originalNumber == reversedNumber;
	}

}

package basic;

public class PalindromeNumber {
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

     Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Constraints: -231 <= x <= 231 - 1
    */
    public static boolean isPalindrome(int x) {
        //b1: converting the integer to a string
        String number = String.valueOf(x);

        int left = 0;
        int right = number.length() - 1;

        while(left < right){
            if(number.charAt(left) != number.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static boolean isPalindromeC2(int number) {
        if (number < 0) {
            return false;
        }

        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

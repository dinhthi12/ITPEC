// https://leetcode.com/problems/palindrome-number/description/

#include "exercises/palindrome_number.h"

bool palindromeNumber(int n)
{
  if (n < 0)
  {
    return false;
  }

  long reverse = 0;
  int original = n;


  while (n > 0)
  {
    reverse = (reverse * 10) + (n % 10);
    n = n / 10;
  }

  return reverse == original;
}
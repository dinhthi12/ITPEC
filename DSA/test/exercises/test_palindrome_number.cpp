#include <gtest/gtest.h>
#include "exercises/palindrome_number.h"

TEST(PalindromeNumberTest, BasicCases)
{
  EXPECT_TRUE(palindromeNumber(121));
  EXPECT_FALSE(palindromeNumber(-121));
  EXPECT_FALSE(palindromeNumber(10));
  EXPECT_TRUE(palindromeNumber(0));
  EXPECT_TRUE(palindromeNumber(12321));
  EXPECT_TRUE(palindromeNumber(1221));
  EXPECT_FALSE(palindromeNumber(123));
}

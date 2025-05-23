#include <gtest/gtest.h>
#include "hashtable/roman_to_int.h"

TEST(RomanToIntTest, BasicNumbers)
{
  EXPECT_EQ(romanToInt("III"), 3);
  EXPECT_EQ(romanToInt("IV"), 4);
  EXPECT_EQ(romanToInt("IX"), 9);
  EXPECT_EQ(romanToInt("LVIII"), 58);
  EXPECT_EQ(romanToInt("MCMXCIV"), 1994);
}

TEST(RomanToIntTest, EdgeCases)
{
  EXPECT_EQ(romanToInt(""), 0);
  EXPECT_EQ(romanToInt("I"), 1);
  EXPECT_EQ(romanToInt("MMM"), 3000);
}
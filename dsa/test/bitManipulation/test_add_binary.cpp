#include <gtest/gtest.h>
#include "bitManipulation/add_binary.h"

TEST(AddBinary, BasicTest)
{
  EXPECT_EQ(addBinary("1010", "1011"), "10101");
}

TEST(AddBinary, ZeroTest)
{
  EXPECT_EQ(addBinary("0", "0"), "0");
}

// Test for adding binary strings with carry propagation (e.g., "1111" + "1")
TEST(AddBinary, CarryTest)
{
  EXPECT_EQ(addBinary("1111", "1"), "10000");
}

// Test for adding binary strings of different lengths
TEST(AddBinary, DifferentLengthTest)
{
  EXPECT_EQ(addBinary("101", "10001"), "10110");
}

// Test for adding two binary strings of the same length
TEST(AddBinary, SameLengthTest)
{
  EXPECT_EQ(addBinary("1111", "1111"), "11110");
}

// Test for adding two binary strings of larger length
TEST(AddBinary, LargeLengthTest)
{
  EXPECT_EQ(addBinary("101010", "110110"), "1100000");
}

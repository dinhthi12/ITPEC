#include <gtest/gtest.h>
#include "../include/bitManipulation/addbinary.h"

TEST(BitManipulation, AddBinary)
{
  EXPECT_EQ(addBinary("1010", "1011"), "10101");
  EXPECT_EQ(addBinary("0", "0"), "0");
  EXPECT_EQ(addBinary("1111", "1"), "10000");
}

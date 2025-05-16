#include <gtest/gtest.h>
#include "exercises/sum_squares.h"

TEST(SumSquaresTest, BasicCases)
{
  EXPECT_EQ(sumSquares(1), 1);
  EXPECT_EQ(sumSquares(2), 5);
  EXPECT_EQ(sumSquares(3), 14);
  EXPECT_EQ(sumSquares(5), 55);
}

TEST(SumSquaresTest, EdgeCases)
{
  EXPECT_EQ(sumSquares(0), 0);  // Edge case
  EXPECT_EQ(sumSquares(-3), 0); // Negative input
}

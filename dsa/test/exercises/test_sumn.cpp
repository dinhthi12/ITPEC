#include <gtest/gtest.h>
#include "exercises/sumn.h"

TEST(SumNTest, PositiveNumber)
{
  EXPECT_EQ(sumN(5), 15);

  EXPECT_EQ(sumN(1), 1);

  EXPECT_EQ(sumN(0), 0);
}

TEST(SumNTest, NegativeNumber)
{
  EXPECT_EQ(sumN(-3), 0);
}

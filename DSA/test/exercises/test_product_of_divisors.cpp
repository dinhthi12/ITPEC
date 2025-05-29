#include <gtest/gtest.h>
#include "exercises/product_of_divisors.h"

TEST(ProductOfDivisors, BasicCases)
{
  EXPECT_EQ(productOfDivisors(1), 1);

  EXPECT_EQ(productOfDivisors(6), 36);

  EXPECT_EQ(productOfDivisors(10), 100);

  EXPECT_EQ(productOfDivisors(12), 1728);
}

TEST(ProductOfDivisors, EdgeCases)
{
  EXPECT_EQ(productOfDivisors(0), 1);
  EXPECT_EQ(productOfDivisors(-5), 1);
}

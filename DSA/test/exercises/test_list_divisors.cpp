#include <gtest/gtest.h>
#include "exercises/list_divisors.h"

TEST(ListDivisorOfNumber, BasicTest)
{
  std::vector<int> result = {1, 3, 9};
  ASSERT_EQ(listDivisorOfNumber(9), result);
}

TEST(ListDivisorOfNumber, TestWith12)
{
  std::vector<int> result = {1, 2, 3, 4, 6, 12};
  ASSERT_EQ(listDivisorOfNumber(12), result);
}

TEST(ListDivisorOfNumber, TestWith15)
{
  std::vector<int> result = {1, 3, 5, 15};
  ASSERT_EQ(listDivisorOfNumber(15), result);
}

// Test for number 1, only divisor is {1}
TEST(ListDivisorOfNumber, TestWith1)
{
  std::vector<int> result = {1};
  ASSERT_EQ(listDivisorOfNumber(1), result);
}

// Test for a prime number, number 7, expect divisors {1, 7}
TEST(ListDivisorOfNumber, TestWithPrimeNumber)
{
  std::vector<int> result = {1, 7};
  ASSERT_EQ(listDivisorOfNumber(7), result);
}

TEST(ListDivisorOfNumber, TestWithEvenNumber)
{
  std::vector<int> result = {1, 2, 4, 5, 10, 20};
  ASSERT_EQ(listDivisorOfNumber(20), result);
}

TEST(ListDivisorOfNumber, TestWith100)
{
  std::vector<int> result = {1, 2, 4, 5, 10, 20, 25, 50, 100};
  ASSERT_EQ(listDivisorOfNumber(100), result);
}

#include <gtest/gtest.h>
#include "array/two_sum.h"

TEST(TwoSum, BasicTest)
{
  std::vector<int> nums = {2, 7, 11, 15};
  int target = 9;
  std::vector<int> result = twosum(nums, target);

  ASSERT_EQ(result.size(), 2);
  ASSERT_EQ(result[0], 0);
  ASSERT_EQ(result[1], 1);
}

TEST(TwoSum, NoSolutionTest)
{
  std::vector<int> nums = {1, 2, 3, 4};
  int target = 8;
  std::vector<int> result = twosum(nums, target);

  ASSERT_TRUE(result.empty());
}

/**
 * @brief Find two indices such that the numbers at those indices add up to the target.
 *
 * @param nums Vector of integers to search through.
 * @param target The target sum.
 * @return std::vector<int> A vector containing the two indices. Returns empty vector if no solution found.
 */

#include <unordered_map>
#include "array/two_sum.h"

std::vector<int> twosum(const std::vector<int> &nums, int target)
{
    std::unordered_map<int, int> num_map;

    for (int i = 0; i < nums.size(); ++i)
    {
        int complement = target - nums[i];

        // Check if complement already exists in map
        if (num_map.find(complement) != num_map.end())
        {
            // Found the two numbers, return their indices
            return {num_map[complement], i};
        }

        // Store current number with its index
        num_map[nums[i]] = i;
    }

    // No valid pair found
    return {};
}

#include "exercises/list_divisors.h"

/**
 * @brief List all the divisors of the positive integer n
 *
 * @param n The positive integer for which divisors are to be found
 * @return A vector containing all divisors of n
 */

std::vector<int> listDivisorOfNumber(const int n)
{
  std::vector<int> result;

  // Iterate through all numbers from 1 to n to find divisors
  for (int i = 1; i <= n; i++)
  {
    if (n % i == 0)
    {
      result.push_back(i); // Check if i is a divisor of n
    }
  }

  return result;
}

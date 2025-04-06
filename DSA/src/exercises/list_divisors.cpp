#include "exercises/list_divisors.h"

/**
 * @brief List all the divisors of the positive integer n
 *
 * @param parameter-name description
 * @return description of the return value
 */

std::vector<int> listDivisorOfNumber(const int n)
{
  std::vector<int> result;

  for (int i = 1; i <= n; i++)
  {
    if (n % i == 0)
    {
      result.push_back(i);
    }
  }

  return result;
}
/**
 * @brief Calculate the product of all "divisors" of the positive integer n
 *
 * @param n
 * @return int
 */

#include "exercises/product_of_divisors.h"

int productOfDivisors(int n)
{
  int result = 1;

  for (int i = 1; i <= n; i++)
  {
    if (n % i == 0)
    {
      result *= i;
    }
  }
  return result;
}
// Calculate S(n) = 1^2 + 2^2 + … + n^2

#include "exercises/sum_squares.h"

int sumSquares(int n)
{
  int sum = 0;
  if (n < 0)
    return 0;

  for (int i = 1; i <= n; i++)
  {
    sum += i * i;
  }
  return sum;
}
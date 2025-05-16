#include "exercises/sumn.h"
// Lesson 1: Calculate S(n) = 1 + 2 + 3 + … + n

int sumN(int n)
{
  int sum = 0;
  if (n < 0)
    return 0;

  for (int i = 1; i <= n; i++)
  {
    sum += i;
  }

  return sum;
}
// Calculate S(n) = 1 + ½ + 1/3 + … + 1/n

#include "exercises/sum_series.h"

float sumSeries(int n)
{
  float sum = 0;
  if (n < 0)
  {
    return 0;
  }

  for (int i = 1; i <= n; i++)
  {
    sum += 1.0f / i;
  }
  return sum;
}
/**
 * @brief Given a 4-digit string representing a year (with leading zeros allowed)
 * check if it can be expressed as (a + b)^2 for some non-negative integer a and b.
 * If possible, return one such pair(a, b); otherwise, return -1.
 *
 * @param s A 4-charater string consisting of digits('0'-'9') representing a year.
 * @return A pair of non-negative integers (a, b) such that (a + b)^2 = year, or -1 if not possible.
 *
 * https://codeforces.com/problemset/problem/2114/A
 */

#include <iostream>
#include <cmath>
#include <string>
#include <utility>

std::pair<int, int> squareYear(const std::string s)
{
  int year = std::stoi(s);
  int root = static_cast<int>(sqrt(year));

  if (root * root == year)
  {
    for (int a = 0; a <= root; a++)
    {
      int b = root - a;
      if ((a + b) * (a + b) == year)
      {
        return {a, b};
      }
    }
  }
  return {-1, -1};
}

int main()
{
  int t;
  std::cin >> t;

  while (t--)
  {
    std::string s;
    std::cin >> s;
    auto result = squareYear(s);

    if (result.first == -1)
    {
      std::cout << -1 << "\n";
    }
    else
    {
      std::cout << result.first << " " << result.second << "\n";
    }
  }
  return 0;
}
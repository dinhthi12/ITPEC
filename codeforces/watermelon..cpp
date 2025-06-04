/**
 * @brief Determine if a given watermelon weight can be split into two even parts.
 *
 * Given an integer `w` representing the weight of a watermelon,
 * determine if it is possible to split it into two parts such that:
 *   - both parts have positive weight,
 *   - both parts are even numbers.
 *
 * Return "YES" if such a division is possible, otherwise return "NO".
 *
 * @param w An integer (1 ≤ w ≤ 100) representing the weight of the watermelon.
 * @return A string "YES" or "NO".
 *
 * https://codeforces.com/problemset/problem/4/A
 */

#include <iostream>

std::string watermelon(int w)
{
  if (w % 2 == 0 && w > 2)
  {
    return "YES";
  }
  else
  {
    return "NO";
  }
}

int main()
{
  int t;
  std::cin >> t;

  std::string result = watermelon(t);
  std::cout << result << std::endl;

  return 0;
}
/**
 * https://leetcode.com/problems/roman-to-integer/description/
 *
 */

#include "hashtable/roman_to_int.h"
#include <string>
#include <unordered_map>

int romanToInt(std::string s)

{
  if (s.empty())
    return 0;

  std::unordered_map<char, int> roman = {
      {'I', 1},
      {'V', 5},
      {'X', 10},
      {'L', 50},
      {'C', 100},
      {'D', 500},
      {'M', 1000}};

  int res = 0;

  for (int i = 0; i < s.size() - 1; i++)
  {
    if (roman[s[i]] < roman[s[i + 1]])
    {
      res = res - roman[s[i]];
    }
    else
    {
      res = res + roman[s[i]];
    }
  }

  return res + roman[s.back()];
}
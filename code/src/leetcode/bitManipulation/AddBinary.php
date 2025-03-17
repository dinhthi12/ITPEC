<?php

// https://leetcode.com/problems/add-binary/description/

/**
 * Function to add two binary strings.
 *
 * @param string $a First binary string.
 * @param string $b Second binary string.
 * @return string The sum of the two binary numbers as a binary string.
 */
function addBinary(string $a, string $b): string
{
  // Pointers for each string, starting from the last character (rightmost bit)
  $i = strlen($a) - 1;
  $j = strlen($b) - 1;

  // Carry variable to store carry-over values during addition
  $carry = 0;

  // Result string to store the binary sum
  $result = '';

  // Loop until both strings are fully processed or there's a remaining carry
  while ($i >= 0 || $j >= 0 || $carry == 1) {

    // Add the current bit from string 'a' to carry, if i >= 0
    if ($i >= 0) {
      $carry += $a[$i] - '0'; // Convert character to integer
      $i--;
    }

    // Add the current bit from string 'b' to carry, if j >= 0
    if ($j >= 0) {
      $carry += $b[$j] - '0'; // Convert character to integer
      $j--;
    }

    // Append the result of (carry % 2) to the beginning of the result string
    $result = ($carry % 2) . $result;

    // Update carry for the next iteration
    $carry = intdiv($carry, 2);
  }

  // Return the final binary sum as a string
  return $result;
}

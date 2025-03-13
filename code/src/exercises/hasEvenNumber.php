<?php

/**
 * Check if there is an even number less than 2004 in the array.
 *
 * This function iterates through an array of integers and checks whether
 * there exists at least one even number that is less than 2004.
 *
 * @param array $arr The array of integers to check.
 * @return bool Returns true if an even number less than 2004 exists, false otherwise.
 */

function hasEvenNumberLessThan2004(array $arr): bool
{
  // Loop through each element in the array
  foreach ($arr as $num) {
    // Check if the number is even and less than 2004
    if ($num % 2 === 0 && $num < 2004) {
      return true; // Return true immediately if found
    }
  }

  // If no matching number is found, return false
  return false;
}
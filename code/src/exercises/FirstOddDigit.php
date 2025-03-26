<?php

/**
 * Find the first value whose first digit is an even number.
 *
 * @param array $array The input array of integers.
 * @return int The first value whose first digit is even, or -1 if no such value is found.
 */

 function firstOddDigit($array): int{

  foreach($array as $num){
     // Get the first digit by converting the absolute value of the number to a string
    $firstDigit = (int)strval((abs($num)))[0];

    // Check if the first digit is even
    if ($firstDigit % 2 == 0) {
      return $num;
    }
  }

  return -1; // Return -1 if no such number is found
 }
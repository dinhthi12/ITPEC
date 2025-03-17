<?php

/**
 * Check if a number is prime.
 *
 * A prime number is a natural number greater than 1 that has no divisors other than 1 and itself.
 *
 * @param int $n The number to check.
 * @return bool Returns true if $n is prime, false otherwise.
 */
function isPrimeNumber(int $n): bool
{
  // Numbers less than or equal to 1 are not prime
  if ($n <= 1) {
    return false;
  }

  // 2 is the only even prime number
  if ($n === 2) {
    return true;
  }

  // Any other even number is not prime
  if ($n % 2 === 0) {
    return false;
  }

  // Check for factors from 3 to sqrt(n), skipping even numbers
  for ($i = 3; $i <= sqrt($n); $i += 2) {
    // If $n is divisible by any number in this range, it is not prime
    if ($n % $i === 0) {
      return false;
    }
  }

  // If no divisors were found, the number is prime
  return true;
}

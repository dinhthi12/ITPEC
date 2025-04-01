<?php

use function PHPUnit\Framework\throwException;

/**
 * Find the value in the array that is furthest from x.
 *
 * @param array $values The array of real numbers.
 * @param int $x The reference number.
 * @return array An associative array containing:
 *         - 'value' => the furthest number from x
 *         - 'index' => its position in the array
 * @throws InvalidArgumentException if the array is empty.
 */

function findFurthestValue(array $values, int $x): array
{
  // Ensure the input array is not empty
  if (empty($values)) {
    throw new InvalidArgumentException("The array cannot be empty.");
  }

  // Initialize variables to track the maximum distance and the corresponding index
  $maxDistance = 0;
  $furthestIndex = 0;

  // Loop through each element in the array
  foreach ($values as $index => $value) {
    // Calculate the absolute difference between the current value and x
    $distance = abs($x - $value);

    // If this distance is greater than the current maxDistance, update it
    if ($distance > $maxDistance) {
      $maxDistance = $distance;
      $furthestIndex = $index; // Store the index of the furthest value
    }
  }

  // Return the value and index of the element that is furthest from x
  return [
    "value" => $values[$furthestIndex],
    "index" => $furthestIndex
  ];
}

<?php

/**
 * Create an array containing only odd values from the given array.
 *
 * @param array $values The input array.
 * @return array The filtered array containing only odd numbers.
 */

function oddValuesFromArray(array $values): array
{
    // Initialize an empty array to store the odd numbers
    $arrayResult = [];

    // Loop through each value in the input array
    foreach ($values as $value) {
        // Check if the number is odd (not divisible by 2)
        if ($value % 2 != 0) {
            $arrayResult[] = $value; // Add odd number to the result array
        }
    }

    // Return the array containing only odd numbers
    return $arrayResult;

    // Alternative one-line solution using array_filter:
    // return array_filter($values, fn($value) => $value % 2 != 0);
}

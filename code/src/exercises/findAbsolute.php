<?php


/**
 * Converts any negative numbers among the three inputs to their absolute values.
 *
 * @param float $a First number
 * @param float $b Second number
 * @param float $c Third number
 * @return array An array containing the absolute values of the input numbers.
 */

function findAbsolute(float $a, float $b, float $c): array
{
  return [abs($a), abs($b), abs($c)];
}
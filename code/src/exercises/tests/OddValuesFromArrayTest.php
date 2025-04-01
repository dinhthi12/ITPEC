<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../OddValuesFromArray.php';

class OddValuesFromArrayTest extends TestCase
{
    /**
     * Test with a mix of odd and even numbers
     */
    public function testOddValuesFromArray()
    {
        $input = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        $expected = [1, 3, 5, 7, 9];

        $this->assertSame($expected, oddValuesFromArray($input));
    }

    /**
     * Test with only even numbers (should return an empty array)
     */
    public function testOnlyEvenNumbers()
    {
        $input = [2, 4, 6, 8, 10];
        $expected = [];

        $this->assertSame($expected, oddValuesFromArray($input));
    }

    /**
     * Test with only odd numbers (should return the same array)
     */
    public function testOnlyOddNumbers()
    {
        $input = [1, 3, 5, 7, 9];
        $expected = [1, 3, 5, 7, 9];

        $this->assertSame($expected, oddValuesFromArray($input));
    }

    /**
     * Test with an empty array (should return an empty array)
     */
    public function testEmptyArray()
    {
        $input = [];
        $expected = [];

        $this->assertSame($expected, oddValuesFromArray($input));
    }

    /**
     * Test with negative numbers
     */
    public function testNegativeNumbers()
    {
        $input = [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5];
        $expected = [-5, -3, -1, 1, 3, 5];

        $this->assertSame($expected, oddValuesFromArray($input));
    }
}

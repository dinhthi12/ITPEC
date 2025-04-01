<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../findFurthestValue.php';

class FindFurthestValueTest extends TestCase
{
    /**
     * Test with a mix of numbers
     */
    public function testFindFurthestValue()
    {
        $values = [1, 2, 3, 4, 5];
        $x = 6;
        $expected = ["value" => 1, "index" => 0];

        $this->assertSame($expected, findFurthestValue($values, $x));
    }

    /**
     * Test when x is negative
     */
    public function testNegativeX()
    {
        $values = [-10, 3, 7, 15];
        $x = 5;
        $expected = ["value" => -10, "index" => 0];

        $this->assertSame($expected, findFurthestValue($values, $x));
    }

    /**
     * Test when all numbers are negative
     */
    public function testAllNegativeNumbers()
    {
        $values = [-5, -3, -1, 0];
        $x = -4;
        $expected = ["value" => 0, "index" => 3];

        $this->assertSame($expected, findFurthestValue($values, $x));
    }

    /**
     * Test with an empty array (should throw an exception)
     */
    public function testEmptyArray()
    {
        $this->expectException(InvalidArgumentException::class);
        findFurthestValue([], 10);
    }
}

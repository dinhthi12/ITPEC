<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../HasEvenNumber.php';

class HasEvenNumberTest extends TestCase
{
    public function testHasEvenNumber()
    {
        // Contains an even number less than 2004 (1802)
        $this->assertTrue(hasEvenNumberLessThan2004([2500, 1500, 3001, 1802, 1999]));

        // Contains an even number exactly at the limit (2002)
        $this->assertTrue(hasEvenNumberLessThan2004([2002, 2500, 4000]));

        // Does not contain any even number less than 2004
        $this->assertFalse(hasEvenNumberLessThan2004([2005, 3007, 4001, 1999, 2503]));

        // Empty array should return false
        $this->assertFalse(hasEvenNumberLessThan2004([]));

        // Only odd numbers
        $this->assertFalse(hasEvenNumberLessThan2004([1, 3, 5, 7, 9, 1999]));

        // Only even numbers greater than or equal to 2004
        $this->assertFalse(hasEvenNumberLessThan2004([2004, 2010, 2500, 4002]));

        // Only one even number less than 2004
        $this->assertTrue(hasEvenNumberLessThan2004([2]));
    }
}

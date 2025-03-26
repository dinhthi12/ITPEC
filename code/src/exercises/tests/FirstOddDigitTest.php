<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../FirstOddDigit.php';


class FirstOddDigitTest extends TestCase {

    public function testFirstEvenDigit() {
        // Test case where first even digit is found
        $arr1 = [123, 456, 789, 321];
        $this->assertEquals(456, firstOddDigit($arr1));

        // Test case where no even first digit exists
        $arr2 = [135, 789, 951];
        $this->assertEquals(-1, firstOddDigit($arr2));

        // Test case where first digit is 0 (should be even)
        $arr3 = [0, 3, 7, 9];
        $this->assertEquals(0, firstOddDigit($arr3));

        // Test case with a negative number
        $arr4 = [-123, 456, 789];
        $this->assertEquals(456, firstOddDigit($arr4));

        // Test case with an empty array
        $arr5 = [];
        $this->assertEquals(-1, firstOddDigit($arr5));
    }
}

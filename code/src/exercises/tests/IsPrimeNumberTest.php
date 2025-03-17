<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../IsPrimeNumber.php';
class IsPrimeNumberTest extends TestCase
{

    public function testPrimeNumbers()
    {
        $this->assertTrue(isPrimeNumber(2));
        $this->assertTrue(isPrimeNumber(3));
        $this->assertTrue(isPrimeNumber(17));
        $this->assertTrue(isPrimeNumber(19));
        $this->assertTrue(isPrimeNumber(23));
    }

    public function testNonPrimeNumbers()
    {
        $this->assertFalse(isPrimeNumber(1));
        $this->assertFalse(isPrimeNumber(4));
        $this->assertFalse(isPrimeNumber(9));
        $this->assertFalse(isPrimeNumber(15));
        $this->assertFalse(isPrimeNumber(20));
    }

    public function testNegativeNumbers()
    {
        $this->assertFalse(isPrimeNumber(-1));
        $this->assertFalse(isPrimeNumber(-5));
        $this->assertFalse(isPrimeNumber(-10));
    }

    public function testLargePrimeNumber()
    {
        $this->assertTrue(isPrimeNumber(7919));
    }

    public function testLargeNonPrimeNumber()
    {
        $this->assertFalse(isPrimeNumber(8000));
    }
}

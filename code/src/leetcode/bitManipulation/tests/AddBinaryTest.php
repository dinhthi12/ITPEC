<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../AddBinary.php';

class AddBinaryTest extends TestCase
{
  /**
   * Test the addBinary function with various test cases.
   */
  public function testAddBinary()
  {
    // Test case: Adding '1010' and '1011' should return '10101'
    $this->assertEquals('10101', addBinary('1010', '1011'));

    // Test case: Adding '0' and '0' should return '0'
    $this->assertEquals('0', addBinary('0', '0'));

    // Test case: Adding '1' and '1' should return '10'
    $this->assertEquals('10', addBinary('1', '1'));

    // Test case: Adding '111' and '1' should return '1000'
    $this->assertEquals('1000', addBinary('111', '1'));

    // Test case: Adding '1101' and '101' should return '10010'
    $this->assertEquals('10010', addBinary('1101', '101'));
  }
}

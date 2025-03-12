<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../findAbsolute.php';

class findAbsoluteTest extends TestCase {
  public function testFindAbsolute()
  {

     // Test case 1: all negative numbers
     $this->assertSame([5.5, 3.0, 7.2], findAbsolute(-5.5, 3.0, -7.2));

     // Test case 2: all positive numbers
     $this->assertSame([2.5, 4.0, 6.1], findAbsolute(2.5, 4.0, 6.1));

     // Test case 3: a mixture of negative, positive, and zero numbers
     $this->assertSame([0.0, 3.2, 8.5], findAbsolute(0.0, -3.2, 8.5));

     // Test case 4: large negative numbers
     $this->assertEquals([1000000, 2000000, 3000000], findAbsolute(-1000000, 2000000, 3000000));
  }
}

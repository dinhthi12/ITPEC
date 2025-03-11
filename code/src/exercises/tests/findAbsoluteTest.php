<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../findAbsolute.php';

class findAbsoluteTest extends TestCase {
  public function testFindAbsolute()
  {
    $testFindAbsoluteTest = new findAbsolute();

     // Test case 1: tất cả số âm
     $this->assertSame([5.5, 3.0, 7.2], $testFindAbsoluteTest->convert(-5.5, 3.0, -7.2));

     // Test case 2: tất cả số dương
     $this->assertSame([2.5, 4.0, 6.1], $testFindAbsoluteTest->convert(2.5, 4.0, 6.1));

     // Test case 3: hỗn hợp số âm, dương, và 0
     $this->assertSame([0.0, 3.2, 8.5], $testFindAbsoluteTest->convert(0.0, 3.2, 8.5));

     // Test case 4: số âm lớn
     $this->assertEquals([1000000, 2000000, 3000000], $testFindAbsoluteTest->convert(1000000, 2000000, 3000000));
  }
}

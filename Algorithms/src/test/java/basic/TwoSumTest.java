package basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSum_Case1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testTwoSum_Case2() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    public void testTwoSum_Case3() {
        int[] nums = {3, 3, 3, 3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testTwoSum_Case4() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int[] result = twoSum.twoSum(nums, target);
        assertTrue(result.length == 0);
    }

    @Test
    public void testTwoSum_Case5() {
        int[] nums = {1, 3, 2, 4, 6};
        int target = 7;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void testTwoSum_Case6() {
        int[] nums = {1, 2};
        int target = 3;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}

package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class removeDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums1 = {1, 1, 2};
        int[] expectedNums1 = {1, 2};
        int k1 = solution.removeDuplicates(nums1);
        assertEquals(expectedNums1.length, k1);
        for (int i = 0; i < k1; i++) {
            assertEquals(expectedNums1[i], nums1[i]);
        }

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums2 = {0, 1, 2, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        assertEquals(expectedNums2.length, k2);
        for (int i = 0; i < k2; i++) {
            assertEquals(expectedNums2[i], nums2[i]);
        }
    }
}

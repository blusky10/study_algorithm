package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();


    @Test
    public void testValid() {

        int[] nums = {2, 7, 11, 15};
        int[] result = {0,1};
        int[] ints = twoSum.twoSum(nums, 9);

        assertEquals(ints[0], result[0]);
        assertEquals(ints[1], result[1]);
    }
}

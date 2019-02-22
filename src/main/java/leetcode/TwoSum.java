package leetcode;

// TwoSum
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        int index = 0;
        boolean find = false;
        while (index < nums.length) {
            int pivot = nums[index];

            for (int j = index + 1; j < nums.length; j++) {
                if (pivot + nums[j] == target) {
                    result[0] = index;
                    result[1] = j;
                    find = true;
                    break;
                }
            }
            if (find){
                return result;
            }
            index++;
        }

        return result;
    }
}

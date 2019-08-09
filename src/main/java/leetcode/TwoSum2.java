package leetcode;

import java.util.Arrays;

//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//
//Note:
//
//Your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution and you may not use the same element twice.
//Example:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
public class TwoSum2 {

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();

        int[] ints = twoSum2.twoSum(new int[]{-1, 0}, -1);

        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;

        while( target >= numbers[index1]){
            int result = target - numbers[index1];

            for (int i = index1+1; i<numbers.length; i++){

                if (result < numbers[i]) break;;
                if (result == numbers[i]) {
                    index2 = i;
                    break;
                }
            }

            if (index2 != 0) break;;

            index1++;
        }

        return new int[] {index1+1, index2+1};
    }
}

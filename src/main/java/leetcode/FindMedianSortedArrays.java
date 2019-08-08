package leetcode;

//nums1 = [1, 3]
//nums2 = [2]
//
//The median is 2.0
//Example 2:
//
//nums1 = [1, 2]
//nums2 = [3, 4]
//
//The median is (2 + 3)/2 = 2.5

import java.util.Arrays;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        FindMedianSortedArrays f = new FindMedianSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(f.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        double result = 0;
        int[] sum = new int[total];

        int index = 0;

        for (int i=0; i<nums1.length; i++){
            sum[index] = nums1[i];
            index++;
        }
        for (int i=0; i<nums2.length; i++){
            sum[index] = nums2[i];
            index++;
        }

        Arrays.sort(sum);

        int mid = total/2;
        if (total % 2 == 0){
            result = (double)(sum[mid] + sum[mid-1])/2;
        }else{
            result = (double)sum[mid];
        }
        return result;
    }
}

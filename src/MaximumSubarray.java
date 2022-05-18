public class MaximumSubarray {

//    Given an integer array nums, find the contiguous subarray
//    (containing at least one number) which has the largest sum and return its sum.
//    A subarray is a contiguous part of an array.

    public static int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i=0; i<nums.length; i++)
        {
            currSum+= nums[i];
            if(currSum > maxSum)
            {
                maxSum = currSum;
            }
            if(currSum < 0)
            {
                currSum = 0;
            }
        }
        return maxSum;

    }
    public static void main(String [] args)
    {
        int[] a = new int []{-2,1,-3,4,-1,2,1,-5,4};
        int[] b = new int []{1};
        int[] c = new int []{5,4,-1,7,8};
        System.out.println("Test cases:\n");
        System.out.println("input: [-2,1,-3,4,-1,2,1,-5,4]\noutput: " + maxSubArray(a));
        System.out.println("input: [1]\noutput: " + maxSubArray(b));
        System.out.println("input: [5,4,-1,7,8]\noutput: " + maxSubArray(c));
    }
}

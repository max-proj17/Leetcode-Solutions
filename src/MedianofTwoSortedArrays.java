import java.util.*;
public class MedianofTwoSortedArrays {

    //Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    //The overall run time complexity should be O(log (m+n)).

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a1 = nums1.length;
        int b1 = nums2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];

        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, b1);

        Arrays.sort(c);

        if(c.length%2 != 0)
        {
            return c[c.length/2];
        }else
        {

            return ((double)(c[c.length/2] + c[(c.length/2)-1])/2.0);
        }


    }
    public static void main (String [] args)
    {
        int[] nums1 = new int []{1,3};
        int[] nums2 = new int []{2};

        System.out.println("Test cases:\n");
        System.out.println("input: nums1: [-1,3] nums2: [2] \noutput: " + findMedianSortedArrays(nums1, nums2));
        nums1 = new int []{1,2};
        nums2 = new int []{3,4};
        System.out.println("input: nums1: [-1,3] nums2: [2] \noutput: " + findMedianSortedArrays(nums1, nums2));
    }
}

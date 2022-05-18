import java.util.*;
public class ContainsDuplicate {
    //Given an integer array nums, return true if any value appears
    // at least twice in the array, and return false if every element is distinct.

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> p = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {

            if(p.get(nums[i]) == null)
            {
                p.put(nums[i], 1);

            }else if(p.get(nums[i]) != null)
            {
                p.put(nums[i], p.get(nums[i])+1);
            }
            if(p.get(nums[i]) > 1)
            {
                return true;
            }

        }
        return false;

    }
    public static void main (String [] args)
    {
        int[] a = new int []{1, 2, 3, 1};
        int[] b = new int []{1, 2, 3, 4};
        int[] c = new int []{1,1,1,3,3,4,3,2,4,2};
        System.out.println("Test cases:\n");
        System.out.println("input: [1,2,3,1]\noutput: " + containsDuplicate(a));
        System.out.println("input: [1,2,3,4]\noutput: " + containsDuplicate(b));
        System.out.println("input: [1,1,1,3,3,4,3,2,4,2]\noutput: " + containsDuplicate(c));
    }
}

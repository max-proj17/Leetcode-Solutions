import java.util.*;
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> tmp = new HashMap<Integer, Integer>();
        int final_1 [] = new int [2];

        for(int n = 0; n<nums.length; n++)
        {
            if(tmp.containsKey(target - nums[n])) //we check if we've seen the difference in the map
            {
                //record current position and the value position of the current difference
                final_1[0] = tmp.get(target-nums[n]);
                final_1[1] = n;
                break;
            }
            else{
                tmp.put(nums[n], n); //Put numbers we haven't seen in map
            }
        }


        return final_1;

    }
    public static void main(String [] args)
    {
        int input_1 [] = {3, 2, 4};
        int input_2 [] = {2,7,11,15};
        int input_3 [] = {3, 3};
        int target = 6;
        int expected [] = {1, 2};
        System.out.println("Input:" + Arrays.toString(input_1));
        System.out.println("Output:" + Arrays.toString(twoSum(input_1, target)));
        System.out.println("Expected:" + Arrays.toString(expected) + "\n");
        target = 9;
        expected[0] = 0;
        expected[1] = 1;
        System.out.println("Input:" + Arrays.toString(input_2));
        System.out.println("Output:" + Arrays.toString(twoSum(input_2, target)));
        System.out.println("Expected:" + Arrays.toString(expected) + "\n");
        target = 6;
        System.out.println("Input:" + Arrays.toString(input_3));
        System.out.println("Output:" + Arrays.toString(twoSum(input_3, target)));
        System.out.println("Expected:" + Arrays.toString(expected) + "\n");



    }
}

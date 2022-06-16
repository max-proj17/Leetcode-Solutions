public class Binary_Search {
    public static void main (String [] args)
    {
        int[] arr1 = {-2, 3, 4, 7, 8, 9, 11, 13};
        assert search(arr1, 11) == 6;
        assert search(arr1, 13) == 7;
        assert search(arr1, -2) == 0;

    }

    public static int search(int [] arr, int target)
    {
        //left and right are indexes in the array
        int left = 0;
        int right = arr.length -1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if (arr[mid] == target)
            {
                return mid;
            }else if(target < arr[mid])
            {
                right = mid-1;
            }else
            {
                left = mid+1;
            }
        }
        return -1;
    }
}

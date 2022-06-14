import java.util.Random;


public class Recur_Algo_prac {
    public static void main(String [] args)
    {
        int [] a = new int [] {1, 2, 3, 4, 5, 6, 7, 8 ,9 , 10};
        System.out.println(sum(a, 5));

        Random rand = new Random();
        int [] numbers = new int[10];

        for(int i = 0; i< numbers.length; i++)
        {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter:");

        printArray(numbers);

        int [] numberss = new int[10];

        for(int i = 0; i< numbers.length; i++)
        {
            numberss[i] = rand.nextInt(10);
        }
        System.out.println("\nBefore: ");
        printArray(numberss);

        quickSort(numberss, 0, numberss.length-1);

        System.out.println("\nAfter:");

        printArray(numberss);

    }
    public static void quickSort(int [] array, int lowIndex, int highIndex)
    {
        //low index and high index prevents quicksort from being called across
        //whole array everytime. Recursive steps take low,high index to make subarrays
        if(lowIndex >= highIndex)//base case of subarray of one element
        {
            return;
        }
        //choose a pivot
        int pivIndex = new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot = array[pivIndex]; //gets pivot in either a subarray or starting array
        swap(array, pivIndex, highIndex);
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer-1); //quicksort left partition recursively
        quickSort(array, leftPointer+1, highIndex); //quicksort right partition recursively
    }
    public static int partition(int[] array, int lowIndex, int highIndex, int pivot)
    {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //This while loop finds a number greater than the pivot with lp(left to right) and
        //a number less than our pivot with rp(right to left). We then swap the two numbers.
        while(leftPointer<rightPointer)
        {
            //These while loops will move closer together and swap when necessary(mentioned above)
            while(array[leftPointer]<=pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex); //swap pivot with number that lp and rp meet at
        return leftPointer;
    }

    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int sum(int [] a, int N)
    {
        if(N <= 0) //base case
        {
            return 0;
        }
        System.out.println(a[N-1]);
        return(sum(a, N-1) + a[N-1]); //
    }
    public static void merge(int [] inputArray, int [] leftHalf, int [] rightHalf)
    {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j=0, k=0; //iterators for left, right and merged array respectively

        while(i < leftSize && j < rightSize)
        {
            if(leftHalf[i] <= rightHalf[j]) //if left num smaller than num in right
            {
                inputArray[k] = leftHalf[i]; //add to merged array
                i++;
            }else                           //if right is smaller, add it instead
            {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        //To cleanup leftover numbers if i!=j in size
        while (i<leftSize)
        {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize)
        {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int [] inputArray)
    {
        int inputLength = inputArray.length;

        if(inputLength<2) //for 0 or 1 elements in array it is already sorted so just return nothing.
        {
            return;
        }
        //divide array into two points

        int midIndex = inputLength/2;
        int [] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLength-midIndex];

        //fill left hand array
        for(int i=0; i<midIndex; i++)
        {
            leftHalf[i] = inputArray[i];
        }
        //fill right hand array
        for(int i=midIndex; i<inputLength; i++)
        {
            rightHalf[i-midIndex] = inputArray[i]; //i-midindex because we want to fill right half starting at 0
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);

        //Merge Arrays
    }
    public static void printArray(int [] array)
    {
        System.out.print("[ ");
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.print(" ]");
    }




}

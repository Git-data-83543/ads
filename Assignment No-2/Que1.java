//Write a insertion sort function to sort array and returns no of comparisions.
import java.util.Arrays;
class InsertionSort
{
    public static void insertionSort(int []arr,int size)
    {
        int comparison = 0;
        // here outside a for loop 
        for(int i = 1;i<size;i++)
        {
            // here we assign a temp value 
            int temp = arr[i];
            // for comparison j value 
            int j = i-1;

            // comparison of left neighbour value is greater than peeked element if found then ahead one position
            while(j>=0 && arr[j]> temp)   // here we check for the j also 
            {
                comparison++;  // here comparison will be increments 
                arr[j+1] = arr[j];    // if element is find then we can assign that greater value at arr[j+1] 
                j--;   // j will be decrement 
            }
            arr[j+1] = temp;   // if not find then arr[j+1] = temp
        }
        System.out.println("Comparsions are : "+comparison);
    }
    public static void main(String[]args)
    {
        int arr[] = {50,30,60,40,20,10};
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        insertionSort(arr,arr.length);
        System.out.println("After Sorting : "+Arrays.toString(arr));
    }
}
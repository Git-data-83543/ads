//Modify the insertion sort algorithm to sort the array in descending order
import java.util.Arrays;
class InsertionSort
{
    public static void insertionSort(int []arr,int size)
    {
        for(int i = 1;i<size;i++)
        {
            int temp = arr[i];

            int j = i-1;

            while(j>=0 && arr[j]<temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[]args)
    {
        int arr[] = {50,30,60,40,20,10};
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        insertionSort(arr,arr.length);
        System.out.println("============== Descending Order ===================");
        System.out.println("After Sorting : "+Arrays.toString(arr));
    }
}
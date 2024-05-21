import java.util.Scanner;
class Que3
{
    public static int binarySearch(int []arr,int left,int right,int key)
    {
        int comparison = 0;
        int mid = (left + right)/ 2;
        if(left > right)
            return -1;

        if(arr[mid] == key)
        {
            comparison++;
            return comparison;
        }
        else if(key < arr[mid])
            return binarySearch(arr,left,mid-1,key);
        else
            return binarySearch(arr,mid+1,right,key);
    }

    public static void main(String[]args)
    {
        int arr[] = {5,6,7,8,9,10,11,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search  : ");
        int key = sc.nextInt();
        int comp = binarySearch(arr,0,arr.length,key);
        System.out.println("Binary search : Number of Comparisons are : "+comp);
    }
}
import java.util.Scanner;
class Que5
{
    public static int binarySearch(int arr[],int size,int key)
    {
        int left = 0,right = size - 1,mid;
        while(right >= left)
        {
            mid = (left + right)/2;

            if(arr[mid] == key)
                return mid;
            else if(key > arr[mid])
                return right = mid -1;
            else
                return left = mid +1;
        }
        return -1;
    }
    public static void main (String[]args)
    {
        int arr[] ={90,80,70,60,50,40,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be search : ");
        int key = sc.nextInt();
        int index = binarySearch(arr,arr.length,key);

        if(index == -1)
            System.out.println("Key not found !!");
        else
            System.out.println("Key found at index : "+index);
    }
}
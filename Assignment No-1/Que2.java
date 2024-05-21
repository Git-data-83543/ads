import java.util.Scanner;
class LinearSearch 
{
    public static int linearSearch(int []arr,int size,int key)
    {
        int count = 0;
        for(int i = 0;i<size-1;i++)
        {
            if(arr[i] == key)
            {
                count = i;
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        // int arr[] = {1,4,5,6,5,7,8};

        int arr[] = {11,22,44,22,33,22};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search  : ");
        int key = sc.nextInt();
        int occurence = linearSearch(arr,arr.length,key);

        System.out.println("Last Occurence of "+key+"  :  "+occurence);
    }
}
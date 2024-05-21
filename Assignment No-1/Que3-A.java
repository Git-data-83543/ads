import java.util.Scanner;
class Que3
{
    public static int linearSearch(int []arr,int size,int key)
    {
        int comparison = 0;
        for(int i = 0;i<size-1;i++)
        {
            comparison++;
            if(arr[i] == key)
            {
               return i;  
            }
        }
        return comparison;
    }

    public static void main(String[]args)
    {
        int arr[] = {9,18,27,36,78,85,62,27};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be search : ");
        int key = sc.nextInt();
        int comp = linearSearch(arr,arr.length,key);
        System.out.println("Linear search : Number of Comparisons are : "+comp);
    }
}
import java.util.Scanner;
class Que6
{
    public static int linearSearch(int []arr,int size,int key,int nthOccurence)
    {
        int count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == key)
                count++;
            if(count == nthOccurence)
                return i;
        }
        return -1;
    }

    public static void main(String[]args)
    {
        int arr[] = {5,7,9,1,6,7,8,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be search : ");
        int key = sc.nextInt();
        System.out.println("Enter the which occurences : ");
        int occurences = sc.nextInt();
        int index = linearSearch(arr,arr.length,key,occurences);
        if(index == -1)
            System.out.println("Key  Not Found !!");
        else
            System.out.println("Key found at index : "+index);
    }
}
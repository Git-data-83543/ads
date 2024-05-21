import java.util.Arrays;
class Que9
{
    public static int selectionSort(int []arr,int size)
    {
        int comp = 0;
        for(int i = 0;i<size - 1;i++)
        {
            for(int j = i+1;j<size - 1;j++)
            {
                comp++;
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return comp;
    }
    public static void main(String[]args)
    {
        int arr[] = {11,8,9,7,2,15,14};
        System.out.println(Arrays.toString(arr));
        int comp = selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println("=================================================================");
        System.out.println("Number of Comparisons : "+comp);
    }
}
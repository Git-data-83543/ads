class Que7
{
    public static int findElement(int []arr,int size)
    {   
        int count = 0;
        for(int i = 0;i<size-1;i++)
        {
            boolean repeat = false;
            for(int j= 0;j<size-1;j++)
            {
                if(arr[i] == arr[j] && i != j)
                {
                    repeat = true;
                    break;
                }
            }
            if(repeat == false)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int element = findElement(arr,arr.length);
        System.out.println("Non - Repeating Element : "+element);
    }
}
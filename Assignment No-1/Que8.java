class Que8
{
    public static int findRank(int arr[],int size,int ele)
    {
        for(int i = 0;i<size;i++)
        {
            if(arr[i] == ele)
                return i;
        }
        return -1;
    }
    public static void main (String[] args)
    {
        int arr[] = {10, 20, 15, 3, 4, 4, 1};
        int rank = findRank(arr,arr.length,4);
       if(rank == -1)
            System.out.println("No rank found !!");
        else
            System.out.println("Rank of 4 is : "+rank);
    }
}
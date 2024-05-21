import java.util.Scanner;
class LinearQueueMain
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        LinearQueue lq = new LinearQueue(size);
        int choice;
        do
        {
            System.out.println("0:EXIT\n1:PUSH\n2:POP\n3:PEEK\n4:DISPLAY");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 0:
                    System.out.println("Thank you for using Linear Queue !!");
                    break;

                case 1:
                    if(lq.isFull())
                    {
                        System.out.println("Queue is Full !!");
                    }
                    else
                    {
                        System.out.println("Enter the element : ");
                        int element = sc.nextInt();
                        lq.push(element);
                        System.out.println("Pushed Element is : "+element);
                    }

                    break;

                case 2:
                    if(lq.isEmpty())
                    {
                        System.out.println("Queue is Empty !!");
                    }
                    else
                    {
                        lq.pop();
                    }

                    break;

                case 3:
                    if(lq.isEmpty())
                    {
                        System.out.println("Queue is Empty !!");
                    }
                    else
                    {
                        System.out.println("Topmost element : "+lq.peek());
                    }

                    break;

                case 4:
                    if(lq.isEmpty())
                    {
                        System.out.println("Queue is Empty !!");
                    }
                    else
                    {
                       System.out.println("================================================================");
                        lq.display();
                    }

                    break;
                default :
                    System.out.println("Invalid choice !! Enter a valid choice !!");

                    break;
            }
        }while(choice != 0);
    }
}
class LinearQueue
{
    private static int arr[];
    private static int rear;
    private static int front;
    private static int size;

    public LinearQueue(int size)
    {
        this.size = size;
        arr = new int[size];
        rear = 0;
        front = 0;
    }

    public void push(int element)
    {
        // increment the rear value
         rear++; 
        // value assign that increment 
        arr[rear] = element;
    }

    public void pop()
    {
        // increment the front value 
        front++;
        System.out.println("Popped Element : "+arr[front]);
        
    }

    public int peek()
    {
        return arr[front + 1];
    }

    public boolean isFull()
    {
        if(rear == size-1)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        if(rear == front)
            return true;
        else
            return false;
    }

    public void display()
    {
        for(int i = 1;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
//Write all possibilites to check palindrome. Also do time and space complexity analysis.

/**
 * 1) enter a one palindrome 
 * 2) check palidrome 
 * 3) 
 */
import java.util.Scanner;
class Palindrome 
{
    public static void palidrome(String s)
    {
        if(str.equals(s.reverse()))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome : ");
        String str = sc.next();
        palidrome(str);
    }
}
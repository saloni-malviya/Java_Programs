package Java_Git;
import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[]args)
    {
       System.out.println("...Program to fibonacci series using for loop.....");
       int first=0,second=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number:");
       int n=sc.nextInt();
       for(int i=1;i<=n;++i)
       {
           int next=first+second;
           first=second;
           second=next;
           System.out.println(first);
       }
       
       //System.out.println(first);
    }
    }
    



package Java_Git;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("...program to calculator....");
        System.out.println(".!.!.!...WELCOME TO SALONI'S CALCULATOR...!.!.!.");
        System.out.println("enter the operation(+,-,*,/,%) which you want to perform:");
        char op=sc.next().charAt(0);
        System.out.println("enter first value:");
        int a=sc.nextInt();
        System.out.println("enter second value:");
        int b=sc.nextInt();
        if(op=='+')
        {
            int result=a+b;
            System.out.println("the addition is:"+result);
        }
        else if(op=='-')
        {
            int result=a-b;
            System.out.println("the subtraction is:"+result);
        }
        else if(op=='*')
        {
            int result=a*b;
            System.out.println("the multiplication is:"+result);
        }
        else if(op=='/')
        {
            int result=a/b;
            System.out.println("the division is:"+result);
        }
        else if(op=='%')
        {
            int result=a%b;
            System.out.println("the modulo is:"+result);
           
        }
        else{
            System.out.println("this case is invalid:");
        }
        System.out.println("THANK YOU FOR USING MY CALCULATOR !!!");
        
}
}
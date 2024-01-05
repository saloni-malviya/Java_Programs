
//Program to Multiplication and Division of two numbers
package Java_Git;

import java.util.Scanner;
public class Mul_n_Div {
 public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("..Program to Multiplication of two numbers..");
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int num3= num1*num2;
        System.out.println("Multiplication of "+num1+" and "+num2+" is:"+num3);
        
        System.out.println("..Program to Division of two numbers..");
        System.out.println("Enter first number");
         num1=sc.nextInt();
        System.out.println("Enter second number");
         num2=sc.nextInt();
         num3= num1/num2;
        System.out.println("The result is:"+num3);
               
    }   
}

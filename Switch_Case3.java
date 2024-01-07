/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;
public class Switch_Case3 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("...program to calculator....");
        System.out.println(".!.!.!...WELCOME TO SALONI'S CALCULATOR...!.!.!.");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Modulo");
        System.out.println("Enter your choice(1,2,3,4,5)");
        int num=sc.nextInt();
        switch(num){
            case 1:
                 System.out.println("calculate Addition");
                 System.out.println("enter first value:");
                 float a=sc.nextFloat();
                 System.out.println("enter second value:");
                 float b=sc.nextFloat();
                 float result=a+b;
                 System.out.println("the addition is:"+result);
                 break;
            
            case 2:
                 System.out.println("calculate Subtraction");
                 System.out.println("enter first value:");
                 a=sc.nextFloat();
                 System.out.println("enter second value:");
                 b=sc.nextFloat();
                 result=a-b;
                 System.out.println("the subtraction is:"+result);
                 break;
                 
            case 3:
                 System.out.println("calculate Multiplication");
                 System.out.println("enter first value:");
                 a=sc.nextFloat();
                 System.out.println("enter second value:");
                 b=sc.nextFloat();
                 result=a*b;
                 System.out.println("the multiplication is:"+result);
                 break;
                 
             case 4:
                 System.out.println("calculate Division");
                 System.out.println("enter first value:");
                 a=sc.nextFloat();
                 System.out.println("enter second value:");
                 b=sc.nextFloat();
                 result=a/b;
                 System.out.println("the division is:"+result);
                 break;
                 
             case 5:
                 System.out.println("calculate Modulo");
                 System.out.println("enter first value:");
                 a=sc.nextFloat();
                 System.out.println("enter second value:");
                 b=sc.nextFloat();
                 result=a%b;
                 System.out.println("the modulo is:"+result);
                 break;    
                 
             default:
                 System.out.println("wrong input !!!");
                 
                 
        }
        System.out.println("THANK YOU FOR USING MY CALCULATOR!!");
    }
}
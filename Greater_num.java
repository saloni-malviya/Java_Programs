/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....program to find greater between two numbers....
package Java_Git;
import java.util.Scanner;
public class Greater_num {
        public static void main(String [] args)
        {
        System.out.println("....program to find greater between two numbers....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater!!");
        }
        else{
            System.out.println(b+" is greater!!");
        }
 
        System.out.println("....program to find greater between three numbers....");
        System.out.println("enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is greater");
            
        }
        else if(b>a &&b>c)
        {
            System.out.println(b+" is greater");
        }
        else if(c>a && c>b)
                {
                    System.out.println(c+" is greater");
                }
        else
        {
            System.out.println("wrong number");
        }
}
}

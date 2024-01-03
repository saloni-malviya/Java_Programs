/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   //....program to find even or odd numbers....

package Java_Git;
import java.util.Scanner;
public class Even_oddnum {
    public static void main(String[]args)
    {
        System.out.println("....program to find even or odd numbers....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("given number is even number");
        }
        else
        {
            System.out.println("given number is odd number");
        }
        
}
}

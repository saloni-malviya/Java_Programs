/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;

public class Fact {
    public static void main(String[]args)
    {
     System.out.println("Program to factorial number using for loop:");
       int fact=1;
       System.out.println("enter the value which you want to factorial");
       Scanner sc=new Scanner(System.in);
       int c=sc.nextInt();
       for(int i=1;i<=c;i++)
       {
           fact=fact*i;
          
       }
       System.out.println("the factorial is:"+fact);
       
    }
}

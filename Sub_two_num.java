/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;
/**
 *
 * @author Onsite Solution
 */
public class Sub_two_num {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int num3= num1-num2;
        System.out.println("Subtraction of two numbers is:"+num3);
               
    }
}

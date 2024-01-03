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
public class Positive_to_neg {
    public static void main(String [] args)
    {
    System.out.println("....program to find positive or negative number");
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num<=0)
        {
            System.out.println("given number is negative number");
        }
        else
        {
            System.out.println("given number is positive number");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...program to check whether value is digit or uppercase or lowercase....
package Java_Git;
import java.util.Scanner;
/**
 *
 * @author Onsite Solution
 */
public class Uprcse_lwrcse_dgt {
    public static void main(String[]args)
    {
        //char c;
        System.out.println("....program to check whether value is digit or uppercase or lowercase....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  value:");
        char c=sc.next().charAt(0);
        if(c>=65 && c<=90)
        {
            System.out.println("this is upper case");
            
        }
        else if(c>97 && c<=122)
        {
            System.out.println("this is lower case");
        }
        else if(c>=48 && c<=57)
        {
            System.out.println("this is a digit");
        }
        else
        {
            System.out.println("this is other case");
        }
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;
                      //Program to check whether number is palindrome or not
public class Palindrome_no {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which you want to palindrome");
        int num=sc.nextInt();
        int rm;   
        int r=0;
        int temp;
        temp=num;
        while(num>0)
        {
            rm=num%10;         //remainder
            r=(r*10)+rm;      //reverse
            num=num/10;
        }
        if(temp==r)
        {
            System.out.println("It is palindrome number");
        }
        else
        {
            System.out.println("It is not palindrome number");
        }
        
    }
}

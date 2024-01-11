/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;
                  //Program to print reverse number using while loop
public class reverse_no {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which you want to reverse");
        int num=sc.nextInt();
//        int num=6451;
        int reverse=0;
        int remainder;
        while(num!=0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("reverse number is:"+reverse);
    }
}

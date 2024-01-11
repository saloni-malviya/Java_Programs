/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;
                         //Program to addition of digit using while loop 
public class Addition_of_digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        //int num=654;
        int digit;
        int sum=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("the addtion of digit is:"+sum);
    }
}

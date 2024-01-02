/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Program to sum of two numbers with user input
package Java_Git;
import java.util.Scanner;
public class add_two_num1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int c=num1+num2;
        System.out.println("sum of "+num1+" and "+num2+" is:"+c);
}
}

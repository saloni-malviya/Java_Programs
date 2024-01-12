/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............Program to Print Sum of Numbers Using Array
package Java_Git;

import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[]args)
    {
    //assignment 1
        System.out.println("program to find sum of given number");
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int i,sum=0;
    for(i=0;i<a.length;i++)
    {
        System.out.println("enter number:");
        a[i]=sc.nextInt();
        sum=sum+a[i];
    }
   
    
        System.out.println("the sum is:"+sum);
    
        
    
}
}
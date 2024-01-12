/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//              ...........Program to print the number using array....................
package Java_Git;

import java.util.Scanner;


public class Array {
           public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
                
    }
}



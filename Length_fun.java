/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

import java.util.Scanner;

public class Length_fun {
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    
    int a[]= new int[5];
    for(int i=0;i<a.length;i++)
    {
        System.out.println("enter the number");
        a[i] = sc.nextInt();
        
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.println("the element is:"+a[i]);
    }
    
    
    
    System.out.println(Byte.SIZE);
    
}
}

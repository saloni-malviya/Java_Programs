/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;
/**
 *
 * @author Onsite Solution
 */
public class Odd_num {
    public static void main(String[]args)
    {
       int i; 
        System.out.println("program to print all odd number from given numbers:");
        Scanner sc=new Scanner(System.in); 
        int d[]=new int[10];
        for(i=0;i<d.length;i++)
        {
            System.out.println("enter value:");
            d[i]=sc.nextInt();
        }
        for(i=0;i<d.length;i++)
        {
            if(d[i]%2!=0)
            {
           System.out.println("the odd number is:"+d[i]);
            }
        }
      
}
}
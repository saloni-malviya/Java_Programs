/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

import java.util.Scanner;


public class Max_Min {
      public static void main(String[]args)
    {
    
        System.out.println("......Program to find max and min element in array:..........");
        int b[]=new int[10];
        int max=0;
        int i;
        Scanner sc=new Scanner(System.in);
        //int min=1;
        for(i=0;i<b.length;i++)
        {
            System.out.println("enter value:");
            b[i]=sc.nextInt();
            
        }
      //  max=b[0];
        for(i=0;i<b.length;i++)
        {
            if(max<b[i])
            {
                max=b[i];
            }
           
        }
        System.out.println("maximum value is:"+max);
        int min=b[0];
        for(i=0;i<b.length;i++)
        {
            if(min>b[i])
            {
                min=b[i];
            }
        }
        System.out.println("the min element is:"+min);
           
}
}

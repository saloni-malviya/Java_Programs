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
public class Search_num {
    public static void main(String[]args)
    {
        int i;
         System.out.println("program to find search for a number:");
         Scanner sc=new Scanner(System.in);    
         int v[]=new int[10];
             int num,flag=0;
            for(i=0;i<v.length;i++)
            {
                System.out.println("enter the numbers:");
                v[i]=sc.nextInt();
            }
           
                System.out.println("enter number to be searched");
                num=sc.nextInt();
                for(i=0;i<v.length;i++)
                {
                if(v[i]==num)
                {
                    flag=1;
                    break;
                }
                }
                if(flag==1)
                {
                    System.out.println(num+" is found");
                }
                else
                {
                    System.out.println(num+" is not found");
            }
                
    }
    
}

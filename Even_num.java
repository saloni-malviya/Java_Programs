/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;

public class Even_num {
    public static void main(String[]args)
    {
        int i;
        
    System.out.println("program to print all even number from given numbers:");
    Scanner sc=new Scanner(System.in);
        int c[]=new int[10];
        for(i=0;i<c.length;i++)
        {
            System.out.println("enter value:");
            c[i]=sc.nextInt();
        }
        for(i=0;i<c.length;i++)
        {
            if(c[i]%2==0)
            {
           System.out.println("the even number is:"+c[i]);
            }
            
        }    
            
    }  
      
}

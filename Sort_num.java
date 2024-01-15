/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;

public class Sort_num {
    public static void main(String[]args)
    {
        int i;
        System.out.println("....program to sort number in ascending order....");
        Scanner sc=new Scanner(System.in);        
        int h[]=new int[5];
                int j;
                for(i=0;i<h.length;i++)
                {
                    System.out.println("enter the elements:");
                    h[i]=sc.nextInt();
                }
                for(i=0;i<h.length;i++)
                {
                    for(j=i+1;j<h.length;j++)
                    {
                      if(h[i]>h[j])
                      {
                         int temp=h[i];
                          h[i]=h[j];
                          h[j]=temp;
                      }
                    }
                }
                System.out.println("array after sorting:");
                for(i=0;i<h.length;i++)
                {
                    System.out.println(h[i]);
                }
                   
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//..................Program to find Max and Min element in 2d array............
package Java_Git;
import java.util.*;

public class Max_min_2dArray {
    public static void main(String[]args)
    {
     System.out.println("....program to find max and min element in 2d array....");
            int u[][]=new int[3][3];
            int max=0;
            int i,j;
            //int min=0;
           // int v[][]=new int[3][3];
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("enter numbers :");
                    u[i][j]=sc.nextInt();
                }
            }
            System.out.println("the matrix is:");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    System.out.print(u[i][j]+"\t");
                }
                System.out.println();
            }
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    if(max<u[i][j])
                    {
                        max=u[i][j];
                    }
                 
                }
            }
            
            System.out.println("the max element is:"+max);
            int min=u[0][0];
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    if(min>u[i][j])
                    {
                        min=u[i][j];
                    }
                }
            }
            System.out.println("the min element is:"+min);
            
}
}
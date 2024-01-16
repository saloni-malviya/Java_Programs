/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//......................Program to print Sum of 2 Matrix.............................
package Java_Git;

import java.util.Scanner;

public class Sum_of_2Matrix {
    public static void main(String[]args)
    {
        System.out.println("....program to print sum of 2 matrix....");
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int sum[][]=new int[3][3];
        int i,j;
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.println("enter values of first matrix:");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.println("enter values of second matrix:");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the first matrix is:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(a[i][j]+"\t");
                //System.out.println(b[i][j]);
            }
            System.out.println();
          
        }
        System.out.println("the second matrix is:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("the sum is:");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                    System.out.print(sum[i][j]+"\t");
                   // System.out.println("the matrix is:");
                    //System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
}
}

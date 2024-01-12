/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/// ...................Program to Print Matrix Using Array............................ 

package Java_Git;

import java.util.Scanner;

public class _2D_Array {
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j;
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.println("enter the number:");
                a[i][j]=sc.nextInt();
            }
        }
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }



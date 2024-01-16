/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...................Program to Print Transpose of Matrix..............................
package Java_Git;
import java.util.*;

public class Transpose_of_Matrix {
    public static void main(String[]args)
    {
     System.out.println(".....program to print transpose of matrix.....");
            int v[][]=new int[3][3];
            int i,j;
            int transpose[][]=new int[3][3];
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("enter the number:");
                    v[i][j]=sc.nextInt();
                }
            }
            System.out.println("the matrix is:");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    System.out.print(v[i][j]+"\t");
                }
                System.out.println();
            }
           // System.out.println("transpose of matrix:");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    transpose[j][i]=v[i][j];
                  
                }
              
            }
            System.out.println("transpose of matrix is:");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    System.out.print(transpose[i][j]+"\t");
                }
                System.out.println();
            }
            
    
}
}
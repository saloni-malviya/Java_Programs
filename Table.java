/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

import java.util.Scanner;

public class Table {
    public static void main(String[]args){
        System.out.println("....Program to Print table using for loop......");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value:");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int t=a*i;
            //System.out.print("the table is:");
            System.out.println(a+ "*" +i+ "=" +t);
        }
    
}
}
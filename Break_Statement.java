/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.*;
                               //Break and Continue Statement
public class Break_Statement {
    public static void main(String []args)
    {
    System.out.println("...break and continue statement...");
    Scanner sc=new Scanner(System.in);
        int a,b,c;
        for(int i=1;i<=5;i++)
        {
            System.out.println("enter first number:");
            a=sc.nextInt();
            System.out.println("enter second number:");
            b=sc.nextInt();
            if(b==0)
            {
                System.out.println("B can't be zero");
                break;        //continue;
            }
            else
            {
                c=a/b;
                System.out.println("the result is:"+c);
                break;
            }
        }
        System.out.println("program over!!");
    }
            
}



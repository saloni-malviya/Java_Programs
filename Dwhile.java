/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author Onsite Solution
 */
public class Dwhile {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        //DYNAMIC CASE
        System.out.println("enter number:");
        int num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("....not dynamic....");
         i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
    }
    
}

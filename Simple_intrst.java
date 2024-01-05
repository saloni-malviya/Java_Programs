/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;

public class Simple_intrst {
    public static void main(String[]args)
    {
        System.out.println("...Program to find Simple Interest..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        float p=sc.nextFloat();
        System.out.println("Enter rate");
        float r=sc.nextFloat();
        System.out.println("Enter time");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("Simple Interest is:"+si);

    }
}

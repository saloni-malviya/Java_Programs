/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;
public class Switch_Case2 {
    public static void main(String[]args)
    {
        System.out.println("...Program to calculate any areas like area of square,rectangle,circle,triangle using switch case");
        System.out.println("enter '1' to calculate area of circle");
        System.out.println("enter '2' to calculate area of rectangle");
        System.out.println("enter '3' to calculate area of square");
        System.out.println("enter '4' to calculate area of triangle");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        switch(num)
        {
            case 1:
                System.out.println(".........calculate area of circle...........");
                System.out.println("enter radius");
                float r=sc.nextFloat();
                float area=(float)3.14*r*r;
                System.out.println("the area of circle is:"+area);
                break;
                
            case 2:
                System.out.println(".........calculate area of rectangle...........");
                System.out.println("enter length");
                float l=sc.nextFloat();
                System.out.println("enter width");
                float w=sc.nextFloat();
                area=l*w;
                System.out.println("the area of rectangle is:"+area);
                break;
                
            case 3:    
                System.out.println(".........calculate area of square...........");
                System.out.println("enter side");
                float s=sc.nextFloat();
                area=s*s;
                System.out.println("the area of square is:"+area);
                break;
                
            case 4:
                System.out.println(".........calculate area of triangle...........");
                System.out.println("enter base");
                float b=sc.nextFloat();
                System.out.println("enter height");
                float h=sc.nextFloat();
                area=(b*h)/2;
                System.out.println("the area of triangle is:"+area);
                break;
              
            default:
                System.out.println("Wrong Input!!");
                    
        }
    }
}

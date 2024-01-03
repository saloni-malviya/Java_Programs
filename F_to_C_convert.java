/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
import java.util.Scanner;
/**
 *
 * @author Onsite Solution
 */
public class F_to_C_convert {
              public static void main(String [] args)
              {
    System.out.println("....program to convert ferenhite to centigrade....");
    Scanner sc=new Scanner(System.in);
        System.out.println("press c to convert fahrenheit to centigrade:");
        System.out.println("press f to convert centigrade to fahrenheit:");
        System.out.println("enter your choice(c,f)");
        char d=sc.next().charAt(0);
        if(d=='c')
        {
            System.out.println("enter fahrenheit:");
            float fa=sc.nextFloat();
            float cn=((fa-32)*5)/9;
            System.out.println("the centigrade is:"+cn);
                    
        }
        else if(d=='f')
        {
            System.out.println("enter centigrade:");
            float cn=sc.nextFloat();
            float fa=((cn*9)/5)+32;
            System.out.println("the fahrenheit is:"+fa);
        }
        else
        {
            System.out.println("invalid case:");
        }
        
}
}
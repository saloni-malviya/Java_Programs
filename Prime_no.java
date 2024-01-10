/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

                          //Program to check given number in prime or not
public class Prime_no {
    public static void main(String[]args)
    {
        int n=3;
        int div=2;
        while(div<=n/2)
        {
            if(n%div==0)
            {
                System.out.println("not prime");
                return;
                
            }
            div=div+1;
        
           
        }
        System.out.println("prime");
        
            
        
    }
}
   
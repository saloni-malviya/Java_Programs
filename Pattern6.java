/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

/**
 *
 * @author Onsite Solution
 */
public class Pattern6 {
    public static void main(String[]args)
    {
        int i,j;
        
    System.out.println("....Pattern 6....");
         for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
}
}
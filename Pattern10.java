/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;

/**
 *
 * @author Onsite Solution
 */
public class Pattern10 {
    public static void main(String[]args)
    {
        int i,j;
    System.out.println("....Pattern 10....");
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
}
}
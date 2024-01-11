/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;
 
                     //Program for Continue Statement
public class Continue_Statement {
    public static void main(String[]args)
    {
        for(int i=1;i<=10;i++)
        {
            if(i%3==0)
                continue;
            System.out.println(i);
        }
        System.out.println("Program over!!");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Git;


public class Prime_no_btw_1_to_100 {
    public static void main(String[]args)
    {
        int i,j,count;
        System.out.println("Prime no between 1 to 100");
        for(i=2;i<=100;i++)
        {
            count=0;
            for(j=i;j>=1;j--)
            {
                if(i%j==0)
                    count=count+1;
            }
            if(count==2)
                System.out.print(" "+i+" ");
        }
    }
}

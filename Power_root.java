package Java_Git;
import java.util.Scanner;
public class Power_root {
    public static void main(String[]args)
    {
     System.out.println("....Program to find power root using for loop....");
       int pow=1,base,exponent;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter base:");
        base=sc.nextInt();
        System.out.println("enter exponent:");
        exponent=sc.nextInt();
        for(;exponent!=0;exponent--)
        {
            pow=pow*base;
        }
       System.out.println("result is:"+pow);
       
    }
}

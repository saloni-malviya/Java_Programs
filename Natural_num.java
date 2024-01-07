package Java_Git;
import java.util.Scanner;
public class Natural_num {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("....Program to sum of natural number using for loop......");
        int sum=0;
        System.out.println("enter number");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
             sum=sum+i;
        }
        System.out.println("the sum of natural numbers are:"+sum);
      
    }
}


package Java_Git;
import java.util.Scanner;
public class Result_grade {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("...program to find result grade...");
        System.out.println("enter first subject marks:");
        float s1=sc.nextInt();
        System.out.println("enter second subject marks:");
        float s2=sc.nextInt();
        System.out.println("enter third subject marks:");
        float s3=sc.nextInt();
        float t=s1+s2+s3;
        float per=t/3;
        System.out.println("the total is:"+t);
        System.out.println("the percentage is:"+per+"%");
        if(per>=75 && per<=100)
        {
            System.out.println("your grading point is 'A'");
            System.out.println("wonderful performance, congrats you are pass in first division!!");
        }
        else if(per>=50 && per<=75)
        {
            System.out.println("your grading point is 'B'");
            System.out.println("better performance, congrats you are pass in second division!!");
        }
        else if(per>=33 && per<=50)
        {
            System.out.println("your grading point is 'C'");
            System.out.println("good performance,congrats you are pass in third division!!");
        }
        else if(per>=0 && per<=32)
        {
            System.out.println("your grading point is 'D'");
            System.out.println("you are fail!!");
            System.out.println("please try again next time");
        }
    }
    
}


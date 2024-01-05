
package Java_Git;
import java.util.Scanner;
public class Area_of_circle_rec_trngle {
    public static void main(String[]args)
    {
        System.out.println("...Program to find Area of Circle..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        float r=sc.nextFloat();
        float area=(float)3.14*r*r;
        System.out.println("Area of Circle is:"+area);
        
        System.out.println("...Program to find Area of Square..");
        System.out.println("Enter side");
        float s=sc.nextFloat();
        area=s*s;
        System.out.println("Area of Square is:"+area);
        
        System.out.println("...Program to find Area of Rectangle..");
        System.out.println("Enter length");
        float l=sc.nextFloat();
        System.out.println("Enter width");
        float w=sc.nextFloat();
        float rect=l*w;
        System.out.println("Area of Rectangle is:"+rect);
        
        System.out.println("...Program to find Area of Triangle..");
        System.out.println("Enter value of base");
        float b=sc.nextFloat();
        System.out.println("Enter value of height");
        float h=sc.nextFloat();
        float trngle=(b*h)/2;
        System.out.println("Area of Triangle is:"+trngle);
        
    }
}

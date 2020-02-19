import java.util.Scanner;
public class Rectangle{

     public static void main(String []args){
       double l;
       double w;
       double area;
       double perimeter;
       
      Scanner length= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        l = length.nextDouble();
      
      Scanner width = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        w = width.nextDouble();
       

       area = l * w;
       perimeter = l + l + w + w;
       System.out.println("If a rectangle has a length of:" + l + "cm with a width of:" + w + "cm. Then it will have an area of:" + area + "cm^2 and a perimeter of:" + perimeter + "cm.");
     }
}
import java.util.Scanner;
public class AreaOfCircle {

    public static void main(String[] args) {
        
        final double PI = 3.14159;

        double radius;
        Scanner rad = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        radius = rad.nextDouble();

        double area = PI * radius * radius;

        System.out.println("The area of the Circle is " + area);
    }
}
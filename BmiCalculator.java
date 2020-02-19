import java.util.Scanner;
public class BmiCalculator {

    public static void main(String[] args) {

        double height;
        double weight;
        double kilos;
        double meters;
        double bmi;

        Scanner w= new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        weight = w.nextDouble();
        Scanner h=new Scanner(System.in);
        System.out.println("Enter height in feet");
        height = h.nextDouble();
        

       meters=0.3048*height;
       kilos=0.453592*weight;
       
       bmi= kilos/(meters*meters);
       System.out.println(bmi);
    }
}
import java.util.Scanner;
public class TempCalculator{

  public static void main(String[]args){

  double cels1; // cels is celsius
  double cels2;
  double cels3;
  double celsiusaverage;
	Scanner day1= new Scanner(System.in);
  System.out.println("Enter Celsius for day 1");
  cels1=day1.nextDouble();
  	Scanner day2 = new Scanner(System.in);
  System.out.println("Enter Celsius for day 2");
  cels2=day2.nextDouble();
  	Scanner day3 = new Scanner(System.in);
  System.out.println("Enter Celsius for day 3");
  cels3=day3.nextDouble();

  celsiusavg=((cels1+cels2+cels3)/3);
  System.out.println(celsiusaverage);

  }

 
  
}
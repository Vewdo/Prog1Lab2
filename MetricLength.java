/* MetricLength - converts inches to centimeters
	Anderson, Franceschi
*/

public class MetricLength
{
	public static void main( String [] args )
	{

		double CM_PER_INCH = 2.54;
		double inches = 10;
		double centimeters;

		centimeters = inches * CM_PER_INCH;

		System.out.println( inches + " inches is equivalent to " + centimeters + "cm.");

	}	
}
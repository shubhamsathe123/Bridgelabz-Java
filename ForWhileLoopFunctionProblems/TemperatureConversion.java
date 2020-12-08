/*Help user find degF or degC based on their Conversion Selection. Use
Case Statement and ensure that the inputs are within the Freezing Point (
0 °C / 32 °F ) and the Boiling Point of Water ( 100 °C / 212 °F )
a. degF = (degC * 9/5) + 32
b. degC = (degF – 32) * 5/9 */

package ForWhileLoopProblems;

import java.util.Scanner;

class Coversions
{
	void celsius_far(double cel)
	{
		System.out.println("celcius to fahrenhit conversion");
		double far = (cel * 9/5) + 32;
		System.out.println(far);
	}
	void fare_cel(double far)
	{
		double d=5/9;
		System.out.println("Farenhit to celcius conversion");
		double cel = (far-32) * d;
		System.out.println(cel);
		
	}
}
public class TemperatureConversion 
{
  public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the temperature");
	 double temp=s.nextDouble();
	  Coversions c=new Coversions();
	  c.celsius_far(temp);
	  c.fare_cel(temp);	
}
}

/*Write a program that takes a command-line argument n and prints the nth harmonic
number. Harmonic Number is of the form */

package ForWhileLoopProblems;
import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=s.nextInt();
	
	for(int i=1; i<=n; i++)
	{
		sum=sum+(1/i);
		
	}
	System.out.println("harmonic number is"+sum);
 }
}

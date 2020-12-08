/*Write a program that takes a command-line argument n and prints a
table of the powers of 2 that are less than or equal to 2^n till 256 is
reached..*/
package ForWhileLoopProblems;

import java.util.Scanner;

public class TableUsingWhile {
	public static void main(String[] args) {
	
		System.out.println("enter the input number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int power_of_two=1;
		int i=0;
	   while(power_of_two<=256)
	   {
		   System.out.println(power_of_two);
		   power_of_two=power_of_two*2;
		   i++;
	   }
	}

}

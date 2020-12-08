/*Write a program that takes a command-line argument n and prints a table of the
powers of 2 that are less than or equal to 2^n.*/

package ForWhileLoopProblems;

import java.util.Scanner;

public class TableUsingFor {
public static void main(String[] args) {
	int power_of_two=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=s.nextInt();
	
	for (int i=1; i<=n; i++)
	{
		power_of_two=power_of_two*i;
		System.out.println(power_of_two);
	}
	
}
}

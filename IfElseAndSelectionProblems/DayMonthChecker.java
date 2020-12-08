/*Write a program that takes day and month from the command line and prints true if
day of month is between March 20 and June 20, false otherwise.*/

package IfElseAndSelectionProblems;

import java.util.*;

public class DayMonthChecker {
	public static void main(String[] args) {
		Scanner s=new Scanner("System.in");
		System.out.println("enter your date and month");
		int day = s.nextInt();
		String month=s.next();
 
		if(day>=20 && day<=31 && month=="march")
		{
			System.out.println("true");
		}
		else if(day>=1 && day<=30 && month=="april")
		{
			System.out.println("true");
		}
		else if(day>=1 && day<=31 && month=="may")
		{
			System.out.println("true");
		}
		else if(day>=1 && day<=20 && month=="june")
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	
 
}

}

package IfElseAndSelectionProblems;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		
		if((year%4)==0)
		{
			if((year%100)==0)
			{
			  if((year%400)==0)
			     {
				 System.out.println("year is leap");
			     }
			 else
			     {
				 System.out.println("year is not leap");
			     }
			}
			else
			{
				System.out.println("year is leap");
			}			
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}

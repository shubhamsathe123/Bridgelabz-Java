package IfElseAndSelectionProblems;

import java.util.Scanner;

public class WeekdayUsingIfElse {
	public static void main(String[] args) {
		System.out.println("enetr the day");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a==1)
		{
			System.out.println("monday");
		}
		else if(a==2)
		{
			System.out.println("tuesday");
		}
		else if(a==3)
		{
			System.out.println("wednesday");
		}
		else if(a==4)
		{
			System.out.println("thursday");
		}
		else if(a==5)
		{
			System.out.println("friday");
		}
		else if(a==6)
		{
			System.out.println("saturday");
		}
		
		else
		{
			System.out.println("sunday");
		}
	}

}

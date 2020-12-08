//Read a single digit number and write the number in word
package IfElseAndSelectionProblems;

import java.util.Scanner;

public class NumberInWordUsingIfElse {
	public static void main(String[] args) {
		System.out.println("enetr the number between 0 to 9");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a==1)
		{
			System.out.println("one");
		}
		else if(a==2)
		{
			System.out.println("two");
		}
		else if(a==3)
		{
			System.out.println("three");
		}
		else if(a==4)
		{
			System.out.println("four");
		}
		else if(a==5)
		{
			System.out.println("five");
		}
		else if(a==6)
		{
			System.out.println("six");
		}
		else if(a==7)
		{
			System.out.println("seven");
		}
		else if(a==8)
		{
			System.out.println("eight");
		}
		else if(a==9)
		{
			System.out.println("nine");
		}
		else
		{
			System.out.println("not a single digit number");
		}
	}

}

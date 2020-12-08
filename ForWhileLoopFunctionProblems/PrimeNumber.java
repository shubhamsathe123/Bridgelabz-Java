//Write a program that takes a input and determines if the number is a prime.

package ForWhileLoopProblems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int no=s.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}

}

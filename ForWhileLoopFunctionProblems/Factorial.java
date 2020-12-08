package ForWhileLoopProblems;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		System.out.println("enter the input number");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of the number is"+fact);
	}

}

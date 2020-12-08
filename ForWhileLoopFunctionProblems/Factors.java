package ForWhileLoopProblems;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		System.out.println("enter the input number");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println(i);
			}
		}
	}

}

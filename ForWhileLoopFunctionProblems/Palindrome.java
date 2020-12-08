package ForWhileLoopProblems;

import java.util.Scanner;

class Palin
{
	static  void check(int no)
	{
		int rev=0;
		int temp=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}	
	}
}
public class Palindrome {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no 1");
	int no1=s.nextInt();
	System.out.println("enter no 2");
	int no2=s.nextInt();
	Palin p=new Palin();
	p.check(no1);
	p.check(no2);
	   
}
}

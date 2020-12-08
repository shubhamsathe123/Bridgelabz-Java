/*Take a number from user and check if the number is a Prime then show
that its palindrome is also prime
a. Write function check if number is Prime
b. Write function to get the Palindrome.
c. Check if the Palindrome number is also prime */

package ForWhileLoopProblems;

import java.util.Scanner;

class Prime1
{
	 void prime(int no)
	{
		int count=0;
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
	 boolean palin(int no)
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
			System.out.println("yes palindrome");
		return true;
			
			
		}
		else
		{
			return false;
		}
			
	}
	
	
}

public class PrimeandPalindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int no1=s.nextInt();
		
		Prime1 p=new Prime1();
		p.prime(no1);
		boolean b=p.palin(no1);
		if(b==true)
		{
			p.prime(no1);
		}
	}
	

}

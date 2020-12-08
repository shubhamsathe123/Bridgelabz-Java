/*Find the Magic Number
a. Ask the user to think of a number n between 1 to 100
b. Then check with the user if the number is less then n/2 or greater
c. Repeat till the Magic Number is reached..*/

package ForWhileLoopProblems;

import java.util.Random;
import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int n=r.nextInt(100);
		System.out.println(n);
	int guess=-1;
		
	  while(guess!=n)
	  {
		  System.out.println("enter the guess no");
		  guess=s.nextInt();
		  if(guess==n)
		  {
			  System.out.println("number is correct");
		  }
		  else if(guess>n)
		  {
			  System.out.println("high...");
		  }
		  else
		  {
			  System.out.println("low");
		  }
		  
	  }
		
	}

}

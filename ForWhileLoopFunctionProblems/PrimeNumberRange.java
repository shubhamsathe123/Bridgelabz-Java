/*Extend the program to take a range of number as input and output the Prime
Numbers in that range.*/

package ForWhileLoopProblems;
import java.util.Scanner;

public class PrimeNumberRange {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting number of the range");
		int start=s.nextInt();
		System.out.println("enter the ending number of the range");
		int end=s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
		 for(int j=1;j<=i;j++)
		 {
			 if(i%j==0)
			 {
				 count++;
			 }
		 }
			 if(count==2)
			 {
				 System.out.println(i);
			 }
			 count=0;
		 
		}
	}

}

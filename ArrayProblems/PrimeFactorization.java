/*Extend the Prime Factorization Program to store all the Prime Factors of a
number n into an array and finally display the output.*/

package ArrayProblems;

import java.util.*;

public class PrimeFactorization {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input");
		int no=s.nextInt();
		int count=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				a.add(i);
			}
		}
		
		System.out.println(a);
	}

}

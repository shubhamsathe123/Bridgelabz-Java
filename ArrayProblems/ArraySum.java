//Write a Program to show Sum of three Integer adds to ZERO

package ArrayProblems;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		int sum=0;
		int arr[]=new int[3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 3 array elements");
		for(int i=0;i<3;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of the 3 array elemts is:"+sum);
	}

}

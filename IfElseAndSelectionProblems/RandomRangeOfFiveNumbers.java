package IfElseAndSelectionProblems;

import java.util.Random;

public class RandomRangeOfFiveNumbers {
	public static void main(String[] args) {
		int arr[]=new int[5];
		Random r=new Random();
		
		for(int i=0; i<5; i++)
		{
		   arr[i]=(int) r.nextInt(200);
			
		}
		
		System.out.println("5 ranbdom numbers are");
		for(int i=0; i<5; i++)
		{
		   System.out.println(arr[i]);
			
		}
		
		
	}

}

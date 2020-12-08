//Write a program to simulate a coin flip and print out "Heads" or "Tails" accordingly.

package IfElseAndSelectionProblems;

import java.util.Random;

public class FlipCoin {
public static void main(String[] args) {
	Random r=new Random();
	int i=r.nextInt(1);
	System.out.println("value of i is"+i);
	if(i==1)
	{
		System.out.println("head");
	}
	else
	{
		System.out.println("tail");
	}
	
}
}

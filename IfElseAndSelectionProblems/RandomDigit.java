//Use Random Function (( RANDOM )) to get Single Digit


package IfElseAndSelectionProblems;

import java.util.Random;

public class RandomDigit {
	public static void main(String[] args) {
		Random rand=new Random();
		int Single_digit=rand.nextInt(10);
		System.out.println("single digit random number is:"+Single_digit);
	}

}

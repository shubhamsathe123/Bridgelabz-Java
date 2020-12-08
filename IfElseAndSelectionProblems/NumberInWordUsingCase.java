//Read a single digit number and write the number in word using Case

package IfElseAndSelectionProblems;

import java.util.Scanner;

public class NumberInWordUsingCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice");
		int ch=s.nextInt();
		
		switch(ch)
		{
		 case 0:
		 {
		 	System.out.println("zero");
		 	break;
		 }
		 case 1:
		 {
		 	System.out.println("one");
		 	break;
		 }
		 case 2:
		 {
		 	System.out.println("two");
		 	break;
		 }
		 case 3:
		 {
		 	System.out.println("three");
		 	break;
		 }
		 case 4:
		 {
		 	System.out.println("four");
		 	break;
		 }
		 case 5:
		 {
		 	System.out.println("five");
		 	break;
		 }
		 case 6:
		 {
		 	System.out.println("six");
		 	break;
		 }
		 case 7:
		 {
		 	System.out.println("seven");
		 	break;
		 }
		 case 8:
		 {
		 	System.out.println("eight");
		 	break;
		 }
		 case 9:
		 {
		 	System.out.println("Nine");
		 	break;
		 }
		 default:
		 {
		 	System.out.println("entered no is not asingle digit");
		 }
		}
		
		
	}

}

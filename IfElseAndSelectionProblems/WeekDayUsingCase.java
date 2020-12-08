//Read a Number and Display the week day (Sunday, Monday,...)
package IfElseAndSelectionProblems;

import java.util.Scanner;

public class WeekDayUsingCase {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your choice");
	int ch=s.nextInt();
	
	switch(ch)
	{
	 case 1:
	 {
	 	System.out.println("monday");
	 	break;
	 }
	 case 2:
	 {
	 	System.out.println("tuesday");
	 	break;
	 }
	 case 3:
	 {
	 	System.out.println("wednesday");
	 	break;
	 }
	 case 4:
	 {
	 	System.out.println("thursday");
	 	break;
	 }
	 case 5:
	 {
	 	System.out.println("friday");
	 	break;
	 }
	 case 6:
	 {
	 	System.out.println("saturday");
	 	break;
	 }
	 case 7:
	 {
	 	System.out.println("sunday");
	 	break;
	 }
	 default :
	 {
		 System.out.println("enter valid choice");
	 }
	}
}
}

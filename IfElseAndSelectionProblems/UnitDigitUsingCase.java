//Read a Number 1, 10, 100, 1000, etc and display unit, ten, hundred,...
package IfElseAndSelectionProblems;

import java.util.Scanner;

public class UnitDigitUsingCase 
{
public static void main(String[] args)
  {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int ch=s.nextInt();
	
	switch(ch)
	{
	 case 1:
	 {
	 	System.out.println("unit digit");
	 	break;
	 }
	 case 10:
	 {
	 	System.out.println("tenth");
	 	break;
	 }
	 case 100:
	 {
	 	System.out.println("hundredth");
	 	break;
	 }
	 case 1000:
	 {
	 	System.out.println("thousandth");
	 	break;
	 }
	 case 10000:
	 {
	 	System.out.println("ten thousandth");
	 	break;
	 }
	 default:
	 {
	 	System.out.println("limit exceeded");
	 	break;
	 }
	}
	
 }
}

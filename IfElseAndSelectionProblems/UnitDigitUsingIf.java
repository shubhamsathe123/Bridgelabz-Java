//Read a Number 1, 10, 100, 1000, etc and display unit, ten, hundred,...
package IfElseAndSelectionProblems;

import java.util.Scanner;

public class UnitDigitUsingIf {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   System.out.println("enter the number");
	   int no=s.nextInt();
	   
	   if (no==1)
	   {
		   System.out.println("unit place");
	   }
	   else if(no==10)
	   {
		   System.out.println("tenth place");
	   }
	   else if(no==100)
	   {
		   System.out.println("hundredth");
	   }
	   else if(no==1000)
	   {
		   System.out.println("thousand");
	   }
	   else if (no==10000)
	   {
		   System.out.println("ten thousandth place");
	   }
	   else
	   {
		   System.out.println("limit exceeded");
	   }
	}

}

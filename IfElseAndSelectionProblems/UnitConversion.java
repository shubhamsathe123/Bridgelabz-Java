/* Unit Conversion
a. 1ft = 12 in then 42 in = ? ft
b. Rectangular Plot of 60 feet x 40 feet in meters
c. Calculate area of 25 such plots in acres */

package IfElseAndSelectionProblems;

import java.util.Scanner;

public class UnitConversion {
	public static void main(String[] args) {
		int feet =12;
		Scanner s= new Scanner(System.in);
		System.out.println("enter your choice :");
		System.out.println("1.inch to fit 2.area in acres");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
		    {
			 System.out.println("42 inch into feet is");
			 double  feetc = 42/12;
			 System.out.println(feetc);
			 break;
	     	}
		case 2:
		   {
			   int plot =60 * 40;
			   System.out.println("25 plot in acres is"+(plot*25)+"acres");
			   break;
			   
		   }
		 default:
		   {
			System.out.println("please enter valid choice"); 
		   }
		}
		
		
	}

}

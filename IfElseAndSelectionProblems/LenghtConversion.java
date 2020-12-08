/*Write a program that takes User Inputs and does Unit Conversion of
different Length units
1. Feet to Inch 3. Inch to Feet
2. Feet to Meter 4. Meter to Feet */

package IfElseAndSelectionProblems;
import java.util.Scanner;

public class LenghtConversion {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("1. Feet to Inch 3. Inch to Feet\r\n" + "2. Feet to Meter 4. Meter to Feet");
    int ch=s.nextInt();
    
    switch(ch)
    {
       case 1:
       {
    	   System.out.println("feet to inch conversion");
    	   System.out.println("enter the value in feet");
    	   int feet=s.nextInt();
    	   double inch = 12*feet;
    	   System.out.println("value in inch is :"+inch);
    	   break;
       }
       case 2:
       {
    	   System.out.println("inch to feet conversion");
    	   System.out.println("enter the value in inch");
    	   int inch=s.nextInt();
    	   double feet = inch/12;
    	   System.out.println("value in feet is :"+feet);
    	   break;
       }
       case 3:
       {
    	   System.out.println("feet to meter conversion");
    	   System.out.println("enter the value in feet");
    	   int feet=s.nextInt();
    	   double meter = feet * 0.3048;
    	   System.out.println("value in inch is :"+meter);
    	   break;
       }
       case 4:
       {
    	   System.out.println("meter to feet conversion");
    	   System.out.println("enter the value in meter");
    	   int meter=s.nextInt();
    	   double feet = meter*3.28;
    	   System.out.println("value in inch is :"+feet);
    	   break;
       }
       default:
       {
    	   System.out.println("enter the valid choice");
       }
    }
   }
}

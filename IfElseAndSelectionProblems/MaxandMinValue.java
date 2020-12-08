/*1. Write a program that reads 5 Random 3 Digit values and then outputs the minimum
and the maximum value*/

package IfElseAndSelectionProblems;

public class MaxandMinValue {
public static void main(String[] args) {
	
	int max=999;
	int min=100;
	int no1=(int) (Math.random()*(max-min+1)+min);
	int no2=(int) (Math.random()*(max-min+1)+min);
	int no3=(int) (Math.random()*(max-min+1)+min);
	
System.out.println("no 1 is:"+no1 +"number 2 is:" +no2 +"number 3 is"+no3);

  if(no1>no2 && no1>no3)
  {
	  System.out.println("no1 is max no");
  }
  else if(no2>no1 && no2>no3)
  {
	  System.out.println("no2 is max number");
  }
  else
  {
	  System.out.println("no3 is max no");
  }
  //logic for minimum number
  if(no1<no2 && no1<no3)
  {
	  System.out.println("no1 is minimum no");
  }
  else if(no2<no1 && no2<no3)
  {
	  System.out.println("no2 is minimum number");
  }
  else
  {
	  System.out.println("no3 is minimum no");
  }
  
  
}
}

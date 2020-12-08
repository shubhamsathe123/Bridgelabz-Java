/*4. Write a program that reads 5 Random 2 Digit values , then find their
sum and the average */

package IfElseAndSelectionProblems;

public class FiveRandomNumbers {
	public static void main(String[] args) {
		int min=10;
		int max=99;
		int no1=(int) (Math.random()*(max-min+1)+min);
		int no2=(int) (Math.random()*(max-min+1)+min);
		int no3=(int) (Math.random()*(max-min+1)+min);
		int no4=(int) (Math.random()*(max-min+1)+min);
		int no5=(int) (Math.random()*(max-min+1)+min);
		int sum=no1+no2+no3+no4+no5;
		int avg=(sum/5);
		System.out.println("sum of the 5 random number is:"+sum);
		System.out.println("average of number is:"+avg);
	}

}

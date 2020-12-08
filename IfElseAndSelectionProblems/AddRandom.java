//3. Add two Random Dice Number and Print the Result
package IfElseAndSelectionProblems;

public class AddRandom {
	public static void main(String[] args) {
		int min=1;
		int max=6;
		int no1=(int) (Math.random()*(max-min+1)+min);
		int no2=(int) (Math.random()*(max-min+1)+min);
		
		System.out.println("random no1 is:"+no1);
		System.out.println("random no 2 is:"+no2);
		System.out.println("addition of two random dice no is:"+" "+(no1+no2));
	}

}

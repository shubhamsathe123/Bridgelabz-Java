//2. Use Random to get Dice Number between 1 to 6

package IfElseAndSelectionProblems;

public class DiceNumberRandom {
	public static void main(String[] args) {
		int max=6;
		int min=1;
		int a=(int) (Math.random()*(max-min+1)+min);
	 System.out.println("random number between 1 to 6 is" +a);
	}

}

//Extend the Flip Coin problem till either Heads or Tails wins 11 times.
package ForWhileLoopProblems;

import java.util.Random;

public class HeadTail {
	public static void main(String[] args) {
		
		Random r=new Random();
		for(int i=1;i<=11;i++)
		{
			int no=r.nextInt(1);
			if(no==1)
			{
				System.out.println("head");
			}
			else
			{
				System.out.println("tail");
			}
		}
	}

}

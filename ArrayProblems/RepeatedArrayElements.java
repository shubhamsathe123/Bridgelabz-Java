/*Take a range from 0 – 100, find the digits that are repeated twice like 33, 77,
etc and store them in an array*/

package ArrayProblems;


import java.util.*;

public class RepeatedArrayElements {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println("repated digits from 0 to 100 are");
		for(int i=1;i<=100;i++)
		{
			if(i%11==0)
			{
				a.add(i);
			}
		}
		
		System.out.println(a);
	}
}

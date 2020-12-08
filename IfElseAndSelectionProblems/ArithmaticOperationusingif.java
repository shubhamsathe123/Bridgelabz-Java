/*Enter 3 Numbers do following arithmetic operation and find the one that
is maximum and minimum
1. a + b * c 3. c + a / b
2. a % b + c 4. a * b + c   */

package IfElseAndSelectionProblems;
import java.util.Scanner;

public class ArithmaticOperationusingif {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of a b and c" );
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	
	int op1=(a+b*c);
	int op2=(a%b+c);
	int op3=(c+a/b);
	int op4=(a*b+c);
	
	//logic for maximum
	if(op1>op2 && op1>op3 && op1>op4)
	{
		System.out.println("a+b*c or op1 has the maximum value");
	}
	else if(op2>op1 && op2>op3 && op2>op4)
	{
		System.out.println("a%b+c or op2 has the maximum value");
	}
	else if(op3>op1 && op3>op2 && op3>op4)
	{
		System.out.println("c+a/b or op3 has the maximum value");
	}
	else
	{
		System.out.println("a*b+c or op4 has the maximimum value");
	}
	
	//logic for minimum
	if(op1<op2 && op1<op3 && op1<op4)
	{
		System.out.println("a+b*c or op1 has the minimum value");
	}
	else if(op2<op1 && op2<op3 && op2<op4)
	{
		System.out.println("a%b+c or op2 has the minimum value");
	}
	else if(op3<op1 && op3<op2 && op3<op4)
	{
		System.out.println("c+a/b or op3 has the minimum value");
	}
	else
	{
		System.out.println("a*b+c or op4 has the minimimum value");
	}
}
}

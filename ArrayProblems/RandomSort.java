package ArrayProblems;

import java.util.Random;
class Sorting
{
	static void sort(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
							
				}
			}
		}
		System.out.println("sorted array is");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("second largest element is:"+array[8]);
		System.out.println("second smallest element is:"+array[1]);
	}
	
}
public class RandomSort {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int max=999;
		int min=100;
		
		for(int i=0;i<10;i++)
		{
			arr[i]=(int) (Math.random()*(max-min+1)+min);
		}
		System.out.println("random elements are");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		Sorting r=new Sorting();
		r.sort(arr);
		
	}

}

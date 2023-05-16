package GIT;

import java.util.Arrays;

public class example1 
{
	// to get second largest number in array
	
	public static int getSecondLargest(int[] a, int total )
	{
		
		Arrays.sort(a);
		return a[total];
		
	}
	
	public static void main(String[] args) {
		int a[]= {4,5,6,7,8,9,10,11,556,555,12,13,14,15,16,45,57};

		System.out.println("Second largest number is: "+getSecondLargest(a, a.length-2));
		
	}

}

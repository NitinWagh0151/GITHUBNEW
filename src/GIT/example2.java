package GIT;

import java.util.Arrays;

public class example2 
{
	// to get second smallest number
	
	public static int getSecondsmallest(int[] a,int total)
	{
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args)
	{
		int ar[]= {3,2,3,4,0,5,6,7,6,1,4,9};
		System.out.println("second smallest number is:"+getSecondsmallest(ar, ar.length-1));
	}

}

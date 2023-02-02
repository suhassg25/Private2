package Sortings;

import java.util.Arrays;

public class Sumofmin {
	static int sum(int a[], int n)
	{
		Arrays.sort(a);
		return a[n-1]+a[n];
	}

	public static void main(String[] args) {
		int a[]={200,89,76,1,29};
		System.out.println(sum(a,1));
					
	}

}

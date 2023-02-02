package Patternandnubs;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int d=s.nextInt();
		int  a[] = new int[d];
		int sum=0;
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		
	}

}

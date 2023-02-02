package Patternandnubs;

import java.util.Scanner;

public class OddPosearr {

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
		for(int i=1;i<a.length;i=i+2)
		{		
			sum+=a[i];
		
		}
		System.out.println(sum);
	}

}

package Patternandnubs;

import java.util.Scanner;

public class Sum_evendig {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		long a = s.nextLong();
		long sum = 0;
		
		while(a!=0)
		{
			long b = a%10;
			if(b%2==0)
			{
				sum = sum+b;
			}
			
			a=a/10;
		}
		System.out.println(sum);
	}

}

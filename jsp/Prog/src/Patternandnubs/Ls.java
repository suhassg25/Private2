package Patternandnubs;

import java.util.Scanner;

public class Ls {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number of a");
	int a = s.nextInt();
	for(int i =0;i<a;i++)
	{
		System.out.println("*");
	}
	for(int i =0;i<a+1;i++)
	{
		System.out.print("*"+" ");
	}

	}
	

}

package Patternandnubs;

import java.util.Scanner;

public class Buzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		
		if(a%7==0 || a%10==7)
		{
			System.out.println("Buzz number");
		}
		else
			System.out.println("Not a Buzz number");
	}

}

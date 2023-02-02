package Patternandnubs;

import java.util.Scanner;

public class Rev2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.nextLine();
		String [] a=s1.split(" ");
		String rev=" ";
		
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
				rev=rev+a[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}

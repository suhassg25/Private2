package Patternandnubs;

import java.util.Scanner;

public class Rev3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.nextLine();
		String [] str = s1.split("");
		String rev ="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev =rev+str[i];
		}
System.out.println(rev);
	}

}

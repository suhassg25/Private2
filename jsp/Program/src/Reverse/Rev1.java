package Reverse;

import java.util.Scanner;

public class Rev1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a text");
		String str = s.nextLine();
		String rev="";		
		String [] a = str.split(" ");
		System.out.println(str);
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);
	}

}

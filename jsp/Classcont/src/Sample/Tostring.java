package Sample;

import java.util.Scanner;

public class Tostring {
	String name;
	Tostring(String a)
	{
		name=a;
	}
	public String toString()
	{
		return "My name is : "+name;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String a=s.nextLine();
		Tostring t = new Tostring(a);
		System.out.println(t);

	}

}

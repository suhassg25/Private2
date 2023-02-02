package Numbersystem;

import java.util.Scanner;

public class Singledigit {

public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int a = s.nextInt();
if(a>-10 && a<10)
{
	System.out.println("Single digit");
}
else
	System.out.println("Not a single digit");
s.close();	
}
	}

package Numbersystem;

public class Factrev {

	public static void main(String[] args) {
		int fact =1;
		int num = 5;
		for (int i=num;i>=1;i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
}

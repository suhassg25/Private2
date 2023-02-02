package Numbersystem;

public class Finding_digit {

	public static void main(String[] args) {
		int i = 1238764;
		int count= 0;
		
		while (i!=0)
		{
			i=i/10;
			count++;
		}
		System.out.println(count);
	}
}

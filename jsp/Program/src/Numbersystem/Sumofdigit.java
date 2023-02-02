package Numbersystem;

public class Sumofdigit {

	public static void main(String[] args) {
	
		int num =1234;
		int sum = 0;
		while(num!=0)
		{
			int b = num%10;
			sum=sum+b;
			num = num/10;
		}
		System.out.println(sum);
		

	}

}

package Numbersystem;

public class Sumof_evennum {
	public static void main(String[] args) {
		long num = 234567;
		long sum =0;
		
		while(num!=0)
		{
			long b = num%10;
			if(b%2==0)
			{
				sum=sum+b;
			}
				
		}
		System.out.println(sum);	
	}

}

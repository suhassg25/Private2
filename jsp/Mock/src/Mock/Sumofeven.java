package Mock;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		
		
		int sum=0, b=n;
		System.out.println("given number is : "+b);
		while(b!=0)
		{
			int d=b%10;
			if(d%2==0)
			{
				sum=sum+d;
			}
			b=b/10;
			
		}
		System.out.println("Sum of given even digit is : "+sum);
		
	}

}

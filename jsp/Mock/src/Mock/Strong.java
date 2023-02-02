package Mock;

import java.util.Scanner;

public class Strong {
	
	public static void main(String[] args) {
		int a=1;
			
		while(a!=1000){
			int sum=0;
			int b=a;
				
		while(b!=0)
		{
			
			int d=b%10;
		
			sum=sum+fact(d);
			b=b/10;
		}
		
		
	if(sum==a)
	{
		System.out.println("strong "+a);
	}
	a++;
		}
	}
	static int fact(int x)
	{ int fact=1;
	for(int i=1;i<=x;i++)
	{
		fact=fact*i;
	}
		return fact;
	}
}

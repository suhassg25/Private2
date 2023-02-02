package Patternandnubs;

import java.util.Scanner;

public class Strong {

	static long fact(long a)
	{ long fact=1;
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
		return fact;
	}

	public static void main(String[] args) {
		long a=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter range from 1 to : " );
		long x=s.nextInt();
		while(a!=x){
			long sum=0;
			long copy=a;
				
		while(copy!=0)
		{
			
			long b=copy%10;
		
			sum=sum+fact(b);
			copy=copy/10;
		}
		
		
	if(sum==a)
	{
		System.out.println("strong "+a);
	}
	a++;
		}
	}

	}

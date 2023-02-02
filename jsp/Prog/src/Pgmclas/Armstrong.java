package Pgmclas;


public class Armstrong {
	static int count(int n)
	{	int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	static int power(int base, int exp)
	{
		int p=1;
		while(exp!=0)
		{
			p=p*base;
			exp--;
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++)
		{
			int n=i, copy=n, sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum+=power(d, count(copy));
				n=n/10;
				
			}
			if(sum==copy)
			{
				System.out.println(copy);
			}
		}

	}

}

package Patternandnubs;


public class Char {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			
				System.out.print(i+""+j+" ");
			
			
			
		}
		System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			if(j==i && i>=(n/2)+1 || i+j==n+1 && j>=(n/2)+1 || j==(n/2)+1)
			{
				System.out.print("* ");
				
			}
			else
			{
				System.out.print("  ");
			}
			
			
		}
		System.out.println();
		}
	}
	}


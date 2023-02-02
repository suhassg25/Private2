package Patternandnubs;

public class Pattern {
	public static void main(String[] args) {
		int a=1, n=5;
		for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5;i>=a;i-- )
		{
			for(int j=5;j>=a;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5;i>=a;i-- )
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

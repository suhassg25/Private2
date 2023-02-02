package Patternandnubs;

public class Diamond {
	public static void main(String[] args) {
		int n=7;
	
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(i+j==(n-1) || i+j==(n-1)*2 || i+j==n+1 && i%2==0 || i==j && i+j==n+1)
		{	
			
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	}System.out.println();
}


}
}
package Patternandnubs;

public class Fish {

	public static void main(String[] args) {
		int n=5;
		int m=8;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
//				System.out.print(i+""+j+" ");
				if(j==1 && i==(n/2)+1 || j==2 && i%2 ==0 || j==3 && i==1 || j==3 && i==n || j==4 && i%2 ==0 || i==3 && j==5 || j==6 && i%2==0 || j==7  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			} System.out.println();
		}

	}}



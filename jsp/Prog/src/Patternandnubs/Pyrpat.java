package Patternandnubs;

public class Pyrpat {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("0"+"   ");
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

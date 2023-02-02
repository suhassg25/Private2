package Patternandnubs;

public class Tripat {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{	if(i==1 || i==j || j==5 || i>2 && j<=3)
			{
				System.out.print(i+""+j+" ");
			}
			else
				System.out.print("   ");
				
				
			}
			System.out.println();
		}

	}

}

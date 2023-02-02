package Pgmclas;

public class Removeval {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int res[]=new int[a.length-1];
		int y=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=3)
			{
				res[y]=a[i];
				y++;
			}
		}
		for(int j=0;j<res.length;j++)
		{
			System.out.println(res[j]);
		}

	}

}

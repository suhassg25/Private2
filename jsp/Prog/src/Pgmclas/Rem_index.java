package Pgmclas;

public class Rem_index {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int res[]=new int[a.length-1];
		int y=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=2)
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

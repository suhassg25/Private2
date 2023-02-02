package Pgmclas;

public class Merge2a {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[] ={10,20,30	};
		int res[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			res[a.length+j]=b[j];
		}
		for(int k=0;k<res.length;k++)
		{
			System.out.println(res[k]);
		}

	}

}

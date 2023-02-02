package _2010;

public class Array {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[] = new int[a.length];
		
		for(int i=0, j=b.length-1; i<=b.length && j>=0;i++,j--)
		{
			b[j]=a[i];
		}
//		try{
			for(int k=0;k<=a.length;k++)
			{
				System.out.println(b[k]);
			}
		}
//		catch (Exception e)
//		{
//			System.out.println("");
//		}
		

	}

//}

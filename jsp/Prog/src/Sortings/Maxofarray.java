package Sortings;

import _2010.Array;

public class Maxofarray {

	public static void main(String[] args) {
		int a[] = {10,20,5,7,9,25,100	};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		System.out.println(a[a.length-1]);

	}

}

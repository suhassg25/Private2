package Pgmclas;

public class Array120 {

	public static void main(String[] args) {
		int a[] ={15,7,9,2,0,10};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			
			
		}
		for(int z=0;z<a.length;z++)
		{
			System.out.println(a[z]);
		}
	
	
		
	}
		
		}
	



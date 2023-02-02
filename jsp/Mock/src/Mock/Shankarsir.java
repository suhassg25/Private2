package Mock;

public class Shankarsir {

	public static void main(String[] args) {
		int a[] = {137,31,3,673,362	};
		int sum=0;
		int z=0;
		while(a[0]!=0)
		{
			
			int d=a[0]%10;
		
			for(int i=1;i<a.length;i++)
			{	int count=1;
				while(a[i]!=0)
				{	
				
					int x=a[i]%10;
					if(x==d)
					{
						
						count++;
						while(count!=0)
						{
							sum=sum+d;
							count--;
							
						}
						
						
					}
				
					a[i]=a[i]/10;
					
				}
				
			}	
			a[0]=a[0]/10;
			
		}
		System.out.println("Sum is : "+sum);
		int prod=0;
		while(sum!=0)
		{
			int c=sum%10;
			prod=prod+c;
			sum=sum/10;
		}
		System.out.println("prod is : "+prod);
		}
	

}

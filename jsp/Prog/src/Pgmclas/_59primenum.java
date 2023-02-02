package Pgmclas;

public class _59primenum {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=2;i<=1000;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					
				}
			}
			if(flag==true)
			{
				count++;
				if(count==4)
				{
					System.out.println(i);
				}
			}
			
			
		}
		

	}

}

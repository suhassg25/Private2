package Numbersystem;

public class Sum_ofEvendigit {

	public static void main(String[] args) {
		int i = 1234;
		int h = i;
		int sum=0;
		int count=0;
		while (i!=0)
		{
			int b= i%10;
			count++;
		}	
			if(count%2==0)
			{
				while (h!=0)
				{
					int x=h%10;
					
					if(x%2==0)
					{
						sum=sum+x;
					}
					h=h/2;
				}
				
			}
		System.out.println(sum);	
		
		
	}
}

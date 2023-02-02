package Numbersystem;

public class Strong {
static int fact(int d)
{
	int fact = 1;
	for (int i=1;i<=d;i++)
	{
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
		int i =145;
		int sum = 0,b=i;
		while (i!=0)
		{
			int z = i%10;
			sum = sum + fact(z);
			i=i/10;
			}
		if(sum == b)
		System.out.println("Strong number");
		else
			System.out.println("not a Strong number");
			}

}

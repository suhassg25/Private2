package Parameter;

public class Bytea {
	void sh( byte a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Bytea b = new Bytea();
		byte [] b1 = {1,2,3,4,5,6,7,8};
		b.sh(b1);
	}

}

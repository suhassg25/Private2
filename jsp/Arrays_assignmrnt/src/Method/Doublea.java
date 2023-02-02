package Method;

public class Doublea {
	
	void dob ()
	{
		double d1 [] = {12.4,42.432,421.76,96.432,9078.423};
		for(int i=0;i<d1.length;i++)
		{
			System.out.println(d1[i]);
		}
	}

	public static void main(String[] args) {
		Doublea d = new Doublea();
		d.dob();

	}

}

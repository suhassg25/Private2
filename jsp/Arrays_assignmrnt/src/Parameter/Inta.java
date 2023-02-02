package Parameter;

public class Inta {
	void sa(int a [])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int b [] = {1,2,5,3,4,6 };
	Inta s = new Inta();
	s.sa(b);
		}
}

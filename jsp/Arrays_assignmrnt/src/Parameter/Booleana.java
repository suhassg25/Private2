package Parameter;

public class Booleana {
	void boo(boolean a [] )
	{
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Booleana s = new Booleana();
		boolean b [] = {true,false,true,false,false,true,true};
		s.boo(b);
	}
}

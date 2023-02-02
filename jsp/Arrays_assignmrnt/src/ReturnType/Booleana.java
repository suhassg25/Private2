package ReturnType;


public class Booleana {
	boolean[] boo( )
	{
		boolean b [] = {true,false,true,false,false,true,true};		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		return b;
	}
	public static void main(String[] args) {
		Booleana s = new Booleana();
		boolean [] b = s.boo();
		System.out.println(b);
		
	}
}

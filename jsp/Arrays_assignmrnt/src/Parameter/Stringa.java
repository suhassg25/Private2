package Parameter;

public class Stringa {
	void sh(String [ ]a )
	{
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Stringa s = new Stringa();
		String b [] = {"Inheritance","Encapsulation","Abstraction","Polymorphism"};
		s.sh(b);
	}
}

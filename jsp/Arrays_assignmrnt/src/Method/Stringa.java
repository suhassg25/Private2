package Method;

public class Stringa {
	void sh()
	{
		String a [] = {"Inheritance","Encapsulation","Abstraction","Polymorphism"};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Stringa s = new Stringa();
		s.sh();
	}

}

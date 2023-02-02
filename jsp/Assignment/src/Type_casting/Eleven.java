package Type_casting;
class Sample21
{ int r =5;
	void co()
	{
		System.out.println("hi");
	}
}
class Hahoha extends Sample21
{
	void disp()
	{
		System.out.println("hello");
	}
}
public class Eleven {
public static void main(String[] args) {
	Sample21 s = new Hahoha();
	System.out.println(s.r);
	s.co();
	Hahoha h = (Hahoha) s;
	System.out.println(h.r);
	h.co();
	h.disp();
}
}

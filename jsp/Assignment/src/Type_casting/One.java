package Type_casting;
class Sample1
{
	void co()
	{
		System.out.println("cool");
	}
}
class Guleylua extends Sample1
{
	void disp()
	{
		System.out.println("display");
	}
}
public class One {
public static void main(String[] args) {
	Sample1 s = new Guleylua();
	s.co();
	Guleylua g = (Guleylua) s;
	g.co();
	g.disp();
}
}

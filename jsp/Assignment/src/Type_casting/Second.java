package Type_casting;

class Sample
{
	void disp()
	{
		System.out.println("hi");
	}
}
class Ampulses extends Sample
{
void tata()
{
	System.out.println("tata");
}

}
public class Second {

	public static void main(String[] args) {
		Sample s = new Ampulses();
		s.disp();
		Ampulses a = (Ampulses) s;
		a.disp();
		a.tata();
		
	}

}

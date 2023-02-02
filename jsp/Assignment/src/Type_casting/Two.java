package Type_casting;

class Cool
{
	void add()
	{
		System.out.println("add");
	}
	
}
class Goolata extends Cool
{
void display()
{
	System.out.println("display");
}

}
public class Two {

	public static void main(String[] args) {
		Cool c = new Goolata();
		c.add();
		Goolata g = (Goolata) c;
		g.add();
		g.display();
	}

}

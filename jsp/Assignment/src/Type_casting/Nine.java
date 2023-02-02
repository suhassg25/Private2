package Type_casting;

class Cool4
{
	void add()
	{
		System.out.println("add");
	}
}
class Goolate2 extends Cool4
{
	int r = 5;
	void dispu() {
		System.out.println("displayed");
	}
}
public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cool4 c = new Goolate2();
		c.add();
		Goolate2 g = (Goolate2) c;
		g.add();
		System.out.println(g.r);
		g.dispu();

	}

}

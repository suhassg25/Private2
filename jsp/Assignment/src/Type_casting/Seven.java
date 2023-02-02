package Type_casting;

class Cool2
{
	void disp() {
		System.out.println("display");
	}
}
class Dinga extends Cool2
{
	void tata() {
		System.out.println("tata");
	}
}
public class Seven {

	public static void main(String[] args) {
		Cool2 c = new Dinga();
		c.disp();
		Dinga d = (Dinga) c;
		d.disp();
		d.tata();
	}

}

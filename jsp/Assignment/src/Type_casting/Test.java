package Type_casting;

class Tester
{
	int r=5;
}
class Tista extends Tester
{
void ulliya()
{
	System.out.println("Gn");
}

}

public class Test {

	public static void main(String[] args) {
		Tester d = new Tista();
		System.out.println(d.r);
		Tista p= (Tista) d;
		System.out.println(p.r);
		p.ulliya();

	}

}

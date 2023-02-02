package Type_casting;
class Tester3
{
	int r=5;
	void disp()
	{
		System.out.println("display");
	}
}
class Tista1 extends Tester3
{
	void ulliya()
	{
		System.out.println("tata");
	}
}
public class Eight {
	public static void main(String[] args) {
		Tester3 t1 = new Tista1();
		System.out.println(t1.r);
		t1.disp();
		Tista1 t = (Tista1) t1;
		System.out.println(t.r);
		t.disp();
		t.ulliya();
	}

}

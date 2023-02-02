package Type_casting;

class Tester1
{
	int x = 20;
	void disp()
	{
		System.out.println("hi");
	}
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("hello");
	}
}
public class Six {
public static void main(String[] args) {
	Tester1 t1 = new Huliyacha();
	t1.disp();
	System.out.println(t1.x);
	Huliyacha h = (Huliyacha) t1;
	System.out.println(h.x);
	h.disp();
	h.ho();
	
}
}

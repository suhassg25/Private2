package Type_casting;

class Cola13
{
	int t = 15;
	void disp()
	{
		System.out.println("hello");
	}
}
class Chungacha extends Cola13
{
	int d = 18;
}
public class Twelve {
public static void main(String[] args) {
	Cola13 c = new Chungacha();
 System.out.println(c.t);
 c.disp();
 Chungacha c1 = (Chungacha) c;
 System.out.println(c1.t);
 c1.disp();
 System.out.println(c1.d);
}
}

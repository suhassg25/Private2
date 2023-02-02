package Type_casting;

class Demo1

{
	double z = 10.8;
	
}
class Dumtaka extends  Demo1
{
	int x =20;
}
public class Three {

	public static void main(String[] args) {
		Demo1 d = new Dumtaka();
		System.out.println(d.z);
		Dumtaka d1 = (Dumtaka) d;
		System.out.println(d1.x);
		System.out.println(d1.z);
	}
}

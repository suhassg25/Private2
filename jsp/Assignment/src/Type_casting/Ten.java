package Type_casting;
class Demo10
{
	double z = 10.8d;
	int r =8;
}
class Dumtaka3 extends Demo10
{
	int x = 19;
}
public class Ten {
public static void main(String[] args) {
	Demo10 d =new Dumtaka3();
	System.out.println(d.z);
	System.out.println(d.r);
Dumtaka3 d1 = (Dumtaka3) d;
System.out.println(d1.z);
System.out.println(d1.r);
System.out.println(d1.x);
}
}

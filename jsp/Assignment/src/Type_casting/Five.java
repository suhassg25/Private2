package Type_casting;

class Cola1
{
int x =20;	
}
class Chungocha extends Cola1
{
	int d = 40;
}
public class Five {
public static void main(String[] args) {
	Cola1 c = new Chungocha();
	System.out.println(c.x);
	Chungocha c1 = (Chungocha) c;
	System.out.println(c1.d);
	System.out.println(c1.x);
}
}

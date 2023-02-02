package Type_casting;
class Demo
{
	int x=10;
}
class PemoCha extends Demo
{
void ho()
{
	System.out.println("hi");
}

}
public class Main {
	
	public static void main(String[] args) {
		Demo d = new PemoCha();
		System.out.println(d.x);
		PemoCha p= (PemoCha) d;
		System.out.println(p.x);
		p.ho();
	}


}

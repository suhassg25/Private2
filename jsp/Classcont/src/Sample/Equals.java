package Sample;

public class Equals {
int a;
Equals(int a)
{
	this.a=a;
}

public boolean equals(Object obj)
{
	Equals o = (Equals) obj;
	return this.a==o.a;
}
	
	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(20);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));

	}

}

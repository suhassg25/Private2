package Sample;

public class Hash {
int a;
Hash (int a)
{
	this.a=a;
}

public int hashCode()
{
	return 20;
}
	
	public static void main(String[] args) {
		Hash h = new Hash(100);
		System.out.println(h.hashCode());
	}
}

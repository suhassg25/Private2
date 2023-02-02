package Threadss;

public class Singleton1 {
	private static Singleton1 o;
	private Singleton1()
	{
		System.out.println("object created");
	}
	public static void hi()
	{
		if(o==null)
		{
			o=new Singleton1();
		}
		else
			System.out.println("Object already created can't create again");
			}
	
	

	public static void main(String[] args) {
		hi();
		hi();
		hi();
		
	}

}

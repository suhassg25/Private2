package Threadss;
class Book
{
	static String title="Java";
	public static void reader()
	{
		for(int i=0;i<title.length();i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				
			}
			System.out.println(title.charAt(i));
		}
	}
	public static void writer(String t)
	{try
	{
		Thread.sleep(2000);
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
		title=t;
	}
}
class Thread1 extends Thread
{	@Override
	public void run()
	
	{
		Book.reader();
	}
}
class Thread2 extends Thread
{	@Override
	public void run()
	
	{
		Book.writer("Rocky");
	}
}

public class Multithreadings {

	public static void main(String[] args) {
		Thread t = new Thread1();
		Thread r = new Thread2();
		t.start();
		r.start();
	}

}

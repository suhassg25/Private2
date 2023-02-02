package Method;

public class Chara {
	void sh()
	{
		char a [] = {'A','a','2','%','Z','z'};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Chara s = new Chara();
		s.sh();
	}

}

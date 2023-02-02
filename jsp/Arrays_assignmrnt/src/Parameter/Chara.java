package Parameter;


public class Chara {
	void sh(char a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Chara s = new Chara();
		char b [] = {'A','a','2','%','Z','z'};
		s.sh(b);
	}
}

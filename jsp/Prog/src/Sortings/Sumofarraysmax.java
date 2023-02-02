package Sortings;

public class Sumofarraysmax {
	static int sum(int s[])
	{
		for(int x=0;x<s.length;x++)
		{
			for(int z=0;z<s.length-1;z++)
			{
				if(s[z]>s[z+1])
				{
					int i=s[z];
					s[z]=s[z+1];
					s[z+1]=i;
				}
			}
		}
		return s[s.length-1]+s[s.length-2];
	}

	public static void main(String[] args) {
		int a[]={10,28,24,32,48,2};
		
		System.out.println(sum(a));
	}

}

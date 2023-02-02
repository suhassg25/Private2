package Arraylist;

import java.util.ArrayList;

public class Boolean2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(true);
		a.add(false);
		a.add(true);
		a.add(true);
		
		boolean l []=new boolean[a.size()];
		for(int i=0;i<l.length;i++)
		{
			 l[i]= (Boolean) a.get(i);
		}
		for(int j=0;j<l.length;j++)
		{
			System.out.println(l[j]);
		}
	}

}

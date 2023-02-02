package Arraylist;

import java.util.ArrayList;

public class String2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("HI");
		a.add("HEllo");
		a.add("JAva");
		
		
		String l []=new String [a.size()];
		for(int i=0;i<l.length;i++)
		{
			 l[i]= (String) a.get(i);
		}
		for(int j=0;j<l.length;j++)
		{
			System.out.println(l[j]);
		}

	}

}

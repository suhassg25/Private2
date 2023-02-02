package Arraylist;

import java.util.ArrayList;

public class Booleans {

	public static void main(String[] args) {
		boolean []b= {true,true,false,false,true};
		ArrayList l = new ArrayList();
		for(int i=0;i<b.length;i++)
		{
			l.add(b[i]);
		}
	System.out.println(l);
	}

}

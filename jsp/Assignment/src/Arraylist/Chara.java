package Arraylist;

import java.util.ArrayList;

public class Chara {

	public static void main(String[] args) {
		char []b= {'A', 'z', 'Q', 'j'};
		ArrayList l = new ArrayList();
		for(int i=0;i<b.length;i++)
		{
			l.add(b[i]);
		}
	System.out.println(l);

	}

}

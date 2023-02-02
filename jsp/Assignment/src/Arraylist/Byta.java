package Arraylist;

import java.util.ArrayList;

public class Byta {

	public static void main(String[] args) {
	byte []b= {1,2,3,4,5};
	ArrayList l = new ArrayList();
	for(int i=0;i<b.length;i++)
	{
		l.add(b[i]);
	}
System.out.println(l);
	}

}

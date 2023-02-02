package Arraylist;

import java.util.ArrayList;

public class Short2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		
		short l []=new short [a.size()];
		for(int i=0;i<l.length;i++)
		{
			 l[i]= (Short) a.get(i);
		}
		for(int j=0;j<l.length;j++)
		{
			System.out.println(l[j]);
		}

	}

}

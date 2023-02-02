package Arraylist;

import java.util.ArrayList;

public class Byt2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		
		byte b []=new byte [a.size()];
		for(int i=0;i<b.length;i++)
		{
			 b[i]= (Byte) a.get(i);
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}

	}

}

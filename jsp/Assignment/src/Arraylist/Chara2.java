package Arraylist;

import java.util.ArrayList;

public class Chara2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add('A');
		a.add('z');
		a.add('X');
		a.add('Q');
		
		int l []=new int[a.size()];
		for(int i=0;i<l.length;i++)
		{
			 l[i]= (Character) a.get(i);
		}
		for(int j=0;j<l.length;j++)
		{
			System.out.println(l[j]);
		}

	}

}

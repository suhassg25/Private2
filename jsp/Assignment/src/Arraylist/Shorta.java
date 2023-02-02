package Arraylist;

import java.util.*;

public class Shorta {

	public static void main(String[] args) {
		short s[] = {1,2,3,4,5};
		
		ArrayList  a = new ArrayList();
		
		for(int i=0;i<s.length;i++)
		{
			a.add(s[i]);
		}
		System.out.println(a);

	}

}

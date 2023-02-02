package Arraylist;

import java.util.ArrayList;

public class Float2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(20.4f);
		a.add(99.9f);
		a.add(55.8f);
		
		float f [] = new float[a.size()];
		for(int i=0;i<f.length;i++)
		{
			f[i] =(Float) a.get(i);
		}
		for(int j=0;j<f.length;j++)
		{
			System.out.println(f[j]);
		}

	}

}

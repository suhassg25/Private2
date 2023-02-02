package Arraylist;

import java.util.ArrayList;

public class Double2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(20.4);
		a.add(99.9);
		a.add(55.8);
		
	double f [] = new double [a.size()];
		for(int i=0;i<f.length;i++)
		{
			f[i] =(Double) a.get(i);
		}
		for(int j=0;j<f.length;j++)
		{
			System.out.println(f[j]);
		}

	}

}

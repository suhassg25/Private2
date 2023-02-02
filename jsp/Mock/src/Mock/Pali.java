package Mock;

import java.util.Scanner;

public class Pali {
	static boolean pa(String n)
	{ boolean ret=true;
		String rev="";
		for(int i=n.length()-1;i>=0;i--){
			rev=rev+n.charAt(i);
		}
		if(rev.equals(n))
		{
			ret=true;
		}
		else
		{
			ret=false;
		}
		
		return ret;
	
	}

	public static void main(String[] args) {		
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a  string");
		String s = d.next();
	
System.out.println(pa(s));
	}

}

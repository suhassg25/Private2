package Pgmclas;

import java.util.Scanner;

public class Dateval {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter date");
		int d= s.nextInt();
		System.out.println("Enter month");
		int m= s.nextInt();
		System.out.println("Enter Year");
		int year= s.nextInt();
		
		if( (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && (d<=31 || d>=1) && year>=1 )
		{
			System.out.println(m+" "+d+" "+year+" is a valid date");
		}
		else if( (m==4 || m==6 || m==9 || m==11 ) && (d<=30 || d>=1) && year>=1 )
		{
			System.out.println(d+" "+m+" "+year+" is a valid date");
		}
		else if((m==2 && (d>=1 || d<30)) && year>1)
		{
			if(year%100==0 || year%4==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not a leap year");
			}
		}
		else
		{
			System.out.println("not valid date");
		}

	}

}

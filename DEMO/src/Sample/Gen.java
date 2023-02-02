package Sample;

import java.util.Random;
import java.util.Scanner;

public class Gen {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random random=new Random();
		int otp=0;
		
		for(int i=0;i<4;i++)
		{ 
			int x=random.nextInt(9);
			otp=otp*10+x;
		}
		
		System.out.println(otp);
		
	}

}

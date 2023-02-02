package Patternandnubs;

import java.util.Scanner;

public class Swichar {

	public static void main(String[] args) {
		while(true){
		Scanner s = new Scanner(System.in);
		System.out.println("enter a char a-z");
		char c = s.next().charAt(0);
		int n=5;
	
	
		switch (c)
		{
		case 'A' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==n || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'B' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==n || j==1 || i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'C' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'D' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'E' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || i==(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'F' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'G' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n && i>=(n/2)+1 || i==(n/2)+1 && j>=(n/2)+1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'H' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==n || i==(n/2)+1 || j==1   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'I' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==n || j==(n/2)+1 || i==1   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'J' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==1 || j==n || i==n || j==1 && i>=(n/2)+1 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'K' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==j && i>=(n/2)+1 || j==(n/2)+1 || i+j==n+1 && i<=(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'L' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  i==n   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'M' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i<=(n/2+1) && i==j || i+j==n+1 && i<=3 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'N' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i==j  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'O' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'P' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'Q' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>1 || i==n && j>1 || j==1 && i<n || j==n && i<n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'R' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1 || i==j && i>=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'S' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 ||i==n || j==1 && i<=(n/2)+1 || j==n && i>=(n/2)+1 || i==(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'T' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==(n/2)+1  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'U' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'V' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=(n/2+1) && i==j || i+j==n+1 && i<=3  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'W' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i>=(n/2+1) && i==j || i+j==n+1 && i>=(n/2)+1 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'X' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'Y' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=(n/2+1) && i==j || i+j==n+1 && i<=3  || j==(n/2)+1 && i>=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'Z' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j==n+1 || i==1 || i==n )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'a' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==n || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'b' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==n || j==1 || i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'c' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'd' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		case 'e' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || i==(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'f' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'g' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n && i>=(n/2)+1 || i==(n/2)+1 && j>=(n/2)+1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'h' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==n || i==(n/2)+1 || j==1   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'i' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==n || j==(n/2)+1 || i==1   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'j' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==1 || j==n || i==n || j==1 && i>=(n/2)+1 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'k' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i==j && i>=(n/2)+1 || j==(n/2)+1 || i+j==n+1 && i<=(n/2)+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'l' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  i==n   )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'm' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i<=(n/2+1) && i==j || i+j==n+1 && i<=3 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'n' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i==j  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'o' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'p' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'r' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==(n/2)+1 || j==1 || j==n && i<=(n/2)+1 || i==j && i>=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 's' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 ||i==n || j==1 && i<=(n/2)+1 || j==n && i>=(n/2)+1 || i==(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 't' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==(n/2)+1  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'u' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || j==1 || j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'v' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=(n/2+1) && i==j || i+j==n+1 && i<=3  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'w' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==1 ||  j==n || i>=(n/2+1) && i==j || i+j==n+1 && i>=(n/2)+1 )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'x' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || i+j==n+1  )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'y' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=(n/2+1) && i==j || i+j==n+1 && i<=3  || j==(n/2)+1 && i>=(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		case 'z' : for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j==n+1 || i==1 || i==n )
				{	
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}break;
		
		default : System.out.println("Wrong Charecter Entered");
		}}
		}}

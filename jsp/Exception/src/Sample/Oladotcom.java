package Sample;
class OlaException extends Exception
{
	String s;
	 OlaException(String s) {
		this.s=s;
	}
	 public String getMessage()
	 {
		return s;
		 
	 }
}
public class Oladotcom {
static void ride() throws OlaException
{
	int n=4;
	if(n<=4)
	{
		System.out.println("happy journey");
	}
	else
	{
		throw new OlaException("Final Journey");
	}
}
	
	public static void main(String[] args) {
		try
		{
			ride();
		}
		catch (OlaException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	
	
	}


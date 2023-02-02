package Sample;

public class Shaadidotcom {
	static void submit() throws MarriageException
	{
		int age=15;
		if(age>=21)
		{
			System.out.println("Happy Life");
		}
		else
		{
			throw new MarriageException("invalid age");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			submit();
		}
		catch (MarriageException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
	class MarriageException extends Exception
	{ String msg;
		 MarriageException(String msg) {
			this.msg=msg;
		}
		 public String getMessage()
		 {
			 return msg;
		 }
	
}

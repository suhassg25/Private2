package _5steps;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id name and num");
		int a=s.nextInt();
		String name=s.next();
		long x=s.nextLong();
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			Statement statement=connection.createStatement();
			statement.execute("INSERT INTO EMPLOYEE VALUE ("+a+",'"+name+"',"+x+")");
			System.out.println("Saved");
			connection.close();
		

	}

}

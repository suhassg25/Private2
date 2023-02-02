package _5steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");

		Statement statement=connection.createStatement();
		
		statement.execute("DeLETE FROM EMPLOYEE WHERE id = 2");
		
		connection.close();
		System.out.println("Deleted ");
		
	}

}

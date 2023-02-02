package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String Driver ="com.mysql.cj.jdbc.Driver";
		String url  = "jdbc:mysql://localhost:3306/abc";
		String un ="root";
		String pwd = "root";
		String query  = "INSERT INTO STUDENT VALUE(3,'chandan',962198,'banglore','123@gmail.com',097643)";
		
		
		Class.forName(Driver);
		
		Connection connection  = DriverManager.getConnection(url,un,pwd);
		
		Statement statement  = connection.createStatement();
		
		statement.execute(query);
		
		connection.close();
		System.out.println("Inserted");

	}

}

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Driver =	"com.mysql.cj.jdbc.Driver";		
		String  url ="jdbc:mysql://localhost:3306/abc";
		String  un = "root";
		String  pwd="root";
		String  query="UPDATE STUDENT SET NAME='SUHAS S G' WHERE ID =1 ";
		Class.forName(Driver);
		
		Connection connection = DriverManager.getConnection(url,un,pwd);
		
		Statement statement = connection.createStatement();
		
		statement.execute(query);
		
		connection.close();
		System.out.println("UPDATED");

	}

}

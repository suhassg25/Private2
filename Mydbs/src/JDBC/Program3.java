package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program3 {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String Driver="com.mysql.cj.jdbc.Driver";
		 String url ="jdbc:mysql://localhost:3306/abc";
		String un ="root";
	 String pwd="root";
		 String query="DELETE FROM STUDENT WHERE ID = 3";
				
				Class.forName(Driver);
				Connection connection= DriverManager.getConnection(url,un,pwd);
				Statement statement=connection.createStatement();
				statement.execute(query);
				connection.close();
				System.out.println("Deleted");
				
/* 
 what is API
 what is JDBC
 how do you achieve connection btw java and DAtabase using jdbc api
 what is driver manager in jdbc
 what are drivers in terms of data base
 what is SIngleton give an inbuilt example in jdbc
  
 */
				
	}

}

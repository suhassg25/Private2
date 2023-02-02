package _5steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Firstpgm {

	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		// load/registering driver
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establishing connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");

		//create statements
		Statement s = connection.createStatement();
		
		//Execution of result/statement
		s.execute("INSERT INTO EMPLOYEE VALUE (1,'SUHAS',8976)");
		
		//CLOSE
		connection.close();
		System.out.println("SAVED / CREATED");
	}

}

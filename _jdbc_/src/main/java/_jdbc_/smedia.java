package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class smedia {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
		
		Statement statement = connection.createStatement();
		statement.execute("DELETE FROM status WHERE id in(2,10)");
		connection.close();
		System.out.println("Exe");
	}

}

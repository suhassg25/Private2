package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
	
	public Connection Helps()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

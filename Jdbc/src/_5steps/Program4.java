package _5steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Program4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/abc";
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url,"root","root");
		
		Statement statement = connection.createStatement();
		//statement.execute("UPDATE EMPLOYEE SET name = 'tarun' WHERE id = 3");
		ResultSet resultset = statement.executeQuery("SELECT * FROM EMPLOYEE"); // return type of execute query is //RESULT SET
		while(resultset.next())//return type of next in //BOOLEAN
		{
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getLong(3));
				System.out.println("------------------------------------------");
		}
		
	}

}

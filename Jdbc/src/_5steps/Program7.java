package _5steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Program7 {
	public static void main(String[] args) throws SQLException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter id you want to remove");
		int a=scan.nextInt();
		DriverManager.registerDriver(new Driver());
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
		
		PreparedStatement ps=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
		
		ps.setInt(1, a);
		
		ps.execute();
		
		connection.close();
		System.out.println("success");
	}

}

package _5steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Program6 {
public static void main(String[] args) throws SQLException {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter id");
	int id=s.nextInt();
	System.out.println("enter name");
	String name=s.next();
	System.out.println("enter num");
	long num=s.nextLong();
	DriverManager.registerDriver(new Driver());
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
	
	PreparedStatement ps=connection.prepareStatement("INSERT INTO EMPLOYEE VALUE (?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setLong(3, num);
	
	int i=ps.executeUpdate();
	System.out.println(i);
	System.out.println("Succesfull");
	connection.close();
}
	
}

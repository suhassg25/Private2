package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program1batch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUE(?,?,?)");
			for(int i=1;i<=5;i++)
			{	System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter number");
			long phone=sc.nextLong();
			
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setLong(3, phone);
				
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			connection.close();
			System.out.println("Entered succesfully");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

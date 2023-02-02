package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeCRUD {

	
	
	public void saveEmp(Employee emp)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUE(?,?,?)");
			preparedStatement.setInt(1, emp.getId() );
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setLong(3, emp.getPhone());
			
			preparedStatement.executeUpdate();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Data Inserted saved to Employee Table");
	}
	
	public void updateemp(int id, Employee emp)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMPLOYEE SET pno=? WHERE id=? ");
		
			preparedStatement.setLong(1, emp.getPhone());
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("UPDATED and saved to Employee Table");
	}	
	
	public void delete(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE id=?");
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			connection.close();
				
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("DELETED from table");
	}
	
	public void fetch()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement ps= connection.prepareStatement("SELECT * FROM EMPLOYEE");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));
				System.out.println("-----------------------");
			}
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void fetch(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			PreparedStatement ps= connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));
				System.out.println("-----------------------");
			}
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}
	


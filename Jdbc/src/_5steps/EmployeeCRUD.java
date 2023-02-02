package _5steps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeCRUD {
	Connection connection = new ConHelper().Helper();

	public void Insertion(int id,String name,long num) 
	{	
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("INSERT INTO EMPLOYEE VALUE(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setLong(3, num);
				ps.execute();
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Succesfully Inserted");
	}

	public void Update(String name, int id)
	{
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("UPDATE EMPLOYEE SET name = ? WHERE id=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Updated Succesfully");
	}
	public void Delete(int id)
	{
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE id = ?");
			ps.setInt(1, id);
			
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Deleted succesfully");
	}
}

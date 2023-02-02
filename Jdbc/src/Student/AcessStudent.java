package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class AcessStudent {
	
	Connection connection=new Connecter().Helps();
	
	public void saveStudent(int id,String name,long num,String add,String mail,String pwd)
	{
		String query="INSERT INTO STUDENT VALUE	(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setLong(3, num);
			ps.setString(4, add);
			ps.setString(5, mail);
			ps.setString(6, pwd);
			
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();}
		System.out.println("INSERTED SUCCESFULLY");
	}
	
	public void update(String name, int id)
	{
		String query="UPDATE STUDENT SET NAME=? WHERE ID=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
					
			
			ps.execute();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();}
		System.out.println("UPDATED SUCCESFULLY");
	}
	
	public void delete(int id)
	{
		String query="DELETE FROM STUDENT WHERE ID=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
					
			
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();}
		System.out.println("DELETED SUCCESFULLY");
	}
	public void fetch()
	{
		String q="SELECT * FROM STUDENT";
		try {
			Statement S=connection.createStatement();
			ResultSet rs = S.executeQuery(q);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
				System.out.println("--------------------------------------");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public void fetchid(int id)
	{	String query="SELECT * FROM STUDENT WHERE ID=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

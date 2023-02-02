package Demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Qry {
	
	Connection connection = Conn.c();
	
	public void fetch(String s)
	{	String sql="select * from "+s;
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3));
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

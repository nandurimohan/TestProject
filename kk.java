package kkk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Formatter;

public class kk {

	public static void main(String[] args) 
	{
		Connection con=null;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load the register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
		
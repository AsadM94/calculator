package learnOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String host = "jdbc:mysql://localhost:3306/test01?useSSL=true";
		String username = "root";
		String password = "root";
				
		try 
		{
			Connection con = DriverManager.getConnection( host, username, password );
			System.out.print("Yes");
		} 
		catch (SQLException e) 
		{//hellowowrld
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
			System.out.print("No");
		}
		
	}

}

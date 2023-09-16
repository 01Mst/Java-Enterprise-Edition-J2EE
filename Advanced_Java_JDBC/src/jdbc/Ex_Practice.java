package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement statement=null;
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully!");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
			System.out.println("Connected");
				
			}
		
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

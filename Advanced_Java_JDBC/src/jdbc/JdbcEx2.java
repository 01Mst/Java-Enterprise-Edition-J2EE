package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx2 {
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Statement statement=null;
		Connection connection=null;
		try {
			// Step1: Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully!");
			//Step2:  Create the connection
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
			System.out.println("Connection Created Successfully!");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
	try {
		if(connection!=null) 
		{ connection.close();
			
		}}
		catch(SQLException  e) {
			e.printStackTrace();
		}
	
			   
		}	  
				
		}

	}


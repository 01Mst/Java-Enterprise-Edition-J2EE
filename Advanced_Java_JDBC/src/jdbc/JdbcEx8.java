package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx8 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection created successfully!");
	PreparedStatement p=connection.prepareStatement("update Employee_New set esal=esal+? where esal<?");
		
	    p.setInt(1, 1000);
	    p.setInt(2, 100000);
	       int x=p.executeUpdate();
		    System.out.println("Update records count: "+x );
	    p.close();
			connection.close();
	System.out.println("Resources are released");		
		
		
	}	

	}


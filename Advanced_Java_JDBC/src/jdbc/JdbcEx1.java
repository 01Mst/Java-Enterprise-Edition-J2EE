package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Step1: Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");
		//Step2:  Create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
		//Step3: Create the statement object
	    Statement statement = connection.createStatement();
	    //Step4: Process the query
	    int x=statement.executeUpdate("create table demo2(eid number,ename varchar2(30))");
	    System.out.println("Table Created Successfully!");
	    //Step5: Release the resources
	    statement.close();
	    connection.close();
	    System.out.println("Connection Closed Successfully!");
		
	}

}

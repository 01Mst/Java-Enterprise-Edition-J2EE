package Modification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;;

public class TestConn {
	public static Connection createConnection() {
		Connection connection = null;
	
		try {
		//Load the properties file
		Properties properties=new Properties();
		properties.load(new FileInputStream("C:\\Users\\mstof\\eclipse-workspace\\Advanced_Java\\src\\Modification\\abc.properties"));
	    //Read the data from properties file
		Class.forName(properties.getProperty("driver"));
		connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
}
}
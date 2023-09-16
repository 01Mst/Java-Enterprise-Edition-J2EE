package resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Step1: Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");
		//Step2:  Create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
        Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet set=st.executeQuery("select * from Employee_New");
        set.afterLast();
        while(set.previous()) {
        	System.out.println(set.getString(2));
        }
        set.close();
        st.close();
        connection.close();
}
}


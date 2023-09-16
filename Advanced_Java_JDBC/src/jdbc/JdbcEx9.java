package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx9 {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
			System.out.println("Connection created successfully!");
		PreparedStatement p=connection.prepareStatement("select ename,esal from Employee_New  where esal<?");
		p.setInt(1, 100000);
		ResultSet rs=p.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		        p.close();
				connection.close();
		System.out.println("Resources are released");		
			
			
		}	
 
	}



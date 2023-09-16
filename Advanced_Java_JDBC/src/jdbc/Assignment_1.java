package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813"); Statement statement=connection.createStatement();){
			    
				ResultSet set=statement.executeQuery("select * from Student");
				
				while(set.next()) {
					System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3));
				}
				statement.executeUpdate("update Student set smarks=smarks+2 where smarks<35");
			
			}

		
			 catch(SQLException e) {
				 e.printStackTrace();
				 
			 }

	}

}

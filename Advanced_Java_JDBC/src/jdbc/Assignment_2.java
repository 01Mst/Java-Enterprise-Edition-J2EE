package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813"); Statement statement=connection.createStatement();){
		    
			ResultSet set=statement.executeQuery("select * from Product");
			
			while(set.next()) {
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3)+" "+set.getString(4)+" "+set.getString(5)+" "+set.getString(6));
			}
			
		}

	
		 catch(SQLException e) {
			 e.printStackTrace();
			 
		 }

}

	}



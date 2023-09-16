 package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813"); Statement statement=connection.createStatement();){
		//	statement.executeQuery("insert into Score values('Faf',183)");
			ResultSet set=statement.executeQuery("select * from Score");
			
			while(set.next()) {
				System.out.println(set.getString(1)+" "+set.getInt(2));
			}
		//	statement.executeQuery("drop emp");
		}

	
		 catch(SQLException e) {
			 e.printStackTrace();
			 
		 }

}}

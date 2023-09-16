package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","58813");Statement statement=connection.createStatement();){
		System.out.println("Connected Successfully!");
		ResultSet set=statement.executeQuery("select * from Score");
	while(set.next()) {
		System.out.println(set.getString(1)+" "+set.getString(2));
	}

}
	catch(SQLException e) {
		e.printStackTrace();
		
	}
}}
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Connected!");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Database Connected!");
		Statement statement=connection.createStatement();
		//statement.executeUpdate("create table Success(Plan varchar(20),Execution varchar(20),Consistency varchar(20))");
		statement.executeUpdate("insert into Success values('Require','Require','Require')");
        System.out.println();
        System.out.println("Everything Alright!");
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TM_Ex1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement st=null;
		Savepoint sp=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
			System.out.println("Driver loaded and Connection created!");
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.execute("insert into emp values(01,'Guna',100000)");
			st.execute("insert into emp values(01,'Raj',90000)");
			st.execute("insert into emp values(01,'Johnson',80000)");
		    sp=conn.setSavepoint();
			st.execute("insert into emp values(01,'Elango',100000)");
			conn.commit();
			System.out.println("Transaction completed successful!");
			
		}
		catch(Exception e) {
			conn.rollback(sp);
			System.out.println("Transaction Failed!");
			
		}
		finally {
			if(st!=null) st.close();
			if(conn!=null) st.close();
			
		}
		System.out.println("Resources are released successfully!");
	}

}

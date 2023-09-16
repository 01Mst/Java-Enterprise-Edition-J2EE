package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BO_Ex2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Driver loaded and Connection created!");
		PreparedStatement ps=conn.prepareStatement("update emp set ename=? where ename=?");
		ps.setString(1, "MSD");
		ps.setString(2,"Mst");
		ps.addBatch();
		ps.setString(1, "Mahendra Singh Dhoni");
		ps.setString(2, "Thulasimani");
		ps.addBatch();
		
		ps.executeBatch();
		ps.close();
		conn.close();
		

	}

}

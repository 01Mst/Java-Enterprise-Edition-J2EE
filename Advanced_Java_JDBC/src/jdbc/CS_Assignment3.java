package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CS_Assignment3 {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");

		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
		CallableStatement cs=connection.prepareCall("{call insert_data(?,?,?)}");
		cs.setInt(1, 01);
		cs.setString(2, "Thulasimani");
		cs.setInt(3, 72000);
		cs.executeUpdate();
		System.out.println("Procedure processed successfully!");

}
}
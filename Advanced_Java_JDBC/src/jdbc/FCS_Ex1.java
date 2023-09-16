package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FCS_Ex1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");

		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
		CallableStatement fcs=connection.prepareCall("{?=call getAvg(?,?)}");
		fcs.setInt(2, 111);
		fcs.setInt(3, 222);
		fcs.registerOutParameter(1, Types.INTEGER);
		fcs.execute();
		System.out.println("Average salary is: "+fcs.getFloat(1));

}
}
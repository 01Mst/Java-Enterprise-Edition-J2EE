package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CS_Assignment4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");

		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
		CallableStatement cs=connection.prepareCall("{call givdet(?,?,?,?)}");
		cs.setInt(1, 222);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.INTEGER);
		cs.executeUpdate();
		System.out.println("Callable Statement: "+cs.getInt(2));
		System.out.println("Callable Statement: "+cs.getString(3));
		System.out.println("Callable Statement: "+cs.getInt(4));

}
}
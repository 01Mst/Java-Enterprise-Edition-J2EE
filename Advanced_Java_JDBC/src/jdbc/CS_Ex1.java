package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CS_Ex1 {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully!");

			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
			System.out.println("Connection Created Successfully!");
			CallableStatement cs=connection.prepareCall("{call getSal(?,?)}");
			cs.setInt(1, 111);
			cs.registerOutParameter(2, Types.INTEGER);
			cs.execute();
			System.out.println("Callable Statement: "+cs.getInt(2));

	}

}

package Modification;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class JdbcEx11 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=TestConn.createConnection();
        
		 DatabaseMetaData metaData=connection.getMetaData();
		 System.out.println(metaData.getDatabaseProductName());
		 System.out.println(metaData.getDatabaseProductVersion());
		 System.out.println(metaData.getURL());
		 System.out.println(metaData.getUserName());
		 System.out.println(metaData.getDriverName());
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BO_Ex1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Step1: Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully!");
		//Step2:  Create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection Created Successfully!");
        Statement st=connection.createStatement();
        st.addBatch("create table emp(eid number,ename varchar2(30),esal number)");
        st.addBatch("insert into emp values(01,'Mst',15000)");
        st.addBatch("insert into emp values(19,'Thulasimani',75000)");
        st.addBatch("update emp set eid=01 where eid=19");
        st.executeBatch();
        st.close();
        connection.close();
}
}
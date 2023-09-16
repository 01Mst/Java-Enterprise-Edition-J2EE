package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection created successfully!");
		Statement st=connection.createStatement();
		String q1="select * from Employee_New";
		String q2="update Employee_New set esal=0 where esal<500000";
		boolean Select=st.execute(q1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Select or Update: ");
		String Option=sc.nextLine();
		if(Option.equalsIgnoreCase("Select")) {
			System.out.println("Selection Statement: ");
			ResultSet rs=st.getResultSet();
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}}
		else {
			System.out.println("Update Statement: ");
			int x=st.executeUpdate(q2);
			System.out.println("Total number of updation: "+x);
		}
		connection.close();
}
}
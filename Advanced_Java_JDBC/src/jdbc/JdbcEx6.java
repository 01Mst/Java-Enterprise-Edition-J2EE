package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection created successfully!");
		Statement statement=connection.createStatement();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Empoyee id: ");
			int eid=scanner.nextInt();
			System.out.println("Enter the Employee name: ");
			String ename=scanner.next();
			System.out.println("Enter the Employee Salary: ");
			int esal=scanner.nextInt();
			statement.executeUpdate("insert into Employee_New values("+eid+",'"+ename+"',"+esal+")");
			System.out.println("Data Inserted Successfully!");
			System.out.println("Do you want to insert to insert one more record(yes/no)?");
			String option=scanner.next();
			if(option.equalsIgnoreCase("No")) {
				System.out.println("Process Completed!");
				break;
			}
			scanner.close();
			statement.close();
			connection.close();
			
		}
		
		

	}

}

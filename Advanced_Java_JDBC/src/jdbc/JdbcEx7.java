package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx7 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");
		System.out.println("Connection created successfully!");
	PreparedStatement p=connection.prepareStatement("insert into Employee_New values(?,?,?)");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Empoyee id: ");
			int eid=scanner.nextInt();
			System.out.println("Enter the Employee name: ");
			String ename=scanner.next();
			System.out.println("Enter the Employee Salary: ");
			int esal=scanner.nextInt();
			p.setInt(1, eid);
			p.setString(2, ename);
			p.setInt(3, esal);
			p.executeUpdate();
			System.out.println("Data Inserted Successfully!");
			System.out.println("Do you want to insert to insert one more record(yes/no)?");
			String option=scanner.next();
			if(option.equalsIgnoreCase("No")) {
				System.out.println("Process Completed!");
				break;
			}
		}
			scanner.close();
			p.close();
			connection.close();
			
		
		
		

	}

}

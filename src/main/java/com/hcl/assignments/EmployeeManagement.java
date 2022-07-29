package com.hcl.assignments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		String inputText = "";
		int input;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
		
		System.out.println("Welcome to the Employee Management System");
		System.out.println("-----------------------------------------------");
		while(!inputText.equals("-1")) {
			CallableStatement createEmp = con.prepareCall("call createEmployee(?,?,?,?)");
			CallableStatement removeEmp = con.prepareCall("call removeEmployee(?)");
			CallableStatement searchEmp = con.prepareCall("call searchById(?)");
			PreparedStatement pst = con.prepareStatement("UPDATE emp SET firstname=?, lastname=?, age=? WHERE id=?");
			
			System.out.print("1 to create an employee, 2 to update, 3 to remove, 4 to search by id, and 5 for all employees (-1 to quit): ");
			inputText = s.next();
			
			if(inputText.equals("1")) {
				System.out.println("Please give the new ID: ");
				input = s.nextInt();
				createEmp.setInt(1, input);
				
				System.out.println("Please give the first name: ");
				inputText = s.next();
				createEmp.setString(2, inputText);
				
				System.out.println("Please give the last name: ");
				inputText = s.next();
				createEmp.setString(3, inputText);
				
				System.out.println("Please give the age: ");
				input = s.nextInt();
				createEmp.setInt(4, input);
				
				createEmp.execute();
				System.out.println();
			} 
			else if(inputText.equals("2")) {
				System.out.println("Please give the ID of employee to update: ");
				input = s.nextInt();
				pst.setInt(4, input);
				
				System.out.println("Please give the new first name: ");
				inputText = s.next();
				pst.setString(1, inputText);
				
				System.out.println("Please give the last name: ");
				inputText = s.next();
				pst.setString(2, inputText);
				
				System.out.println("Please give the age: ");
				input = s.nextInt();
				pst.setInt(3, input);
				
				pst.execute();
				System.out.println();
			}
			else if(inputText.equals("3")) {
				System.out.println("Please give the ID to remove: ");
				input = s.nextInt();
				
				searchEmp.setInt(1, input);
				
				ResultSet rs = searchEmp.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
				}
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Is this the employee you would like to remove? (1 for yes, 2 for no) ");
				inputText = s.next();
				
				if(inputText.equals("1")) {
					removeEmp.setInt(1, input);
					removeEmp.execute();
					System.out.println();
				} else {
					System.out.println("Operation Cancelled");
					System.out.println();
				}
			} else if(inputText.equals("4")) {
				System.out.println("Please give the ID to search: ");
				input = s.nextInt();
				
				searchEmp.setInt(1, input);
				
				ResultSet rs = searchEmp.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
				}
				System.out.println();
			} else if(inputText.equals("5")) {
				PreparedStatement ps = con.prepareStatement("select * from emp");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
				}
				System.out.println();
			} else {
				System.out.println("Thank you for using our system.");
			}
		}
		
		
		
	}
}

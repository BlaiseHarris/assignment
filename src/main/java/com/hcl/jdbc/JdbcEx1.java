package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","M0nst3rF33t@3AM");
		Statement st = con.createStatement();
		st.execute("insert into emp values(1,'Dylan', 21)");
		st.execute("insert into emp values(2,'Ajay', 25)");
		st.execute("insert into emp values(3,'Chris', 28)");
		st.execute("insert into emp values(4,'Blaise', 22)");
		st.execute("insert into emp values(5,'Taylor', 29)");
		st.execute("insert into emp values(6,'Dummy', 19)");
	
		st.execute("delete from emp where id=6");
		ResultSet rs = st.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println("Emp Number" + rs.getInt(1));
			System.out.println("Emp Name" + rs.getString("name"));
			System.out.println("Emp Age" + rs.getInt("age"));
		}
	}
	
	
}

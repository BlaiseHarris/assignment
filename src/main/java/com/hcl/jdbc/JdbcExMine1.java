package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExMine1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","M0nst3rF33t@3AM");
		
//		PreparedStatement st = con.prepareStatement("delete from emp where id=?");
//		st.setInt(1, 1);
//		
//		int x = st.executeUpdate();
//		System.out.println(x + " records inserted");
		
		PreparedStatement pst = con.prepareStatement("select * from emp");
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
	}
}

package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "M0nst3rF33t@3AM");
		PreparedStatement st = con.prepareStatement("insert into emp values(?,?,?)");
		st.setInt(1, 6);
		st.setString(2, "Hadiqa");
		st.setInt(3, 24);
		
		int x = st.executeUpdate();
		System.out.println(x + " records inserted");
	}
}

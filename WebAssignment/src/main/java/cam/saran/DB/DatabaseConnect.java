package cam.saran.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnect {
	
	private static Connection con = null;
	
	public static Connection getCon() {
		try {
			if(con==null ) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	};
	
	public static CallableStatement getCreate() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
		CallableStatement createEmp = con.prepareCall("call createEmployee(?,?,?,?)");
		return createEmp;
	}
	
	public static PreparedStatement getUpdate() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
		PreparedStatement updateEmp = con.prepareStatement("UPDATE emp SET firstname=?, lastname=?, age=? WHERE id=?");
		return updateEmp;
		
	}
	
	public static CallableStatement getDelete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
		CallableStatement removeEmp = con.prepareCall("call removeEmployee(?)");
		return removeEmp;
	
	
	}
	public static String getData() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(con);
		PreparedStatement ps = con.prepareStatement("select * from emp");
		
		ResultSet rs=ps.executeQuery();
		String s = "";
		while(rs.next()) {
			s = s + "(ID: " + rs.getInt(1) + ", First: " + rs.getString(2) + ", Last: " + rs.getString(3) + ", Age: " + rs.getInt(4) + ") ";
		}
		return s;
	};
}

package cam.saran.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.saran.model.Employee;

import jakarta.servlet.RequestDispatcher;

public class DatabaseConnect {

	private static Connection con = null;
	private static ArrayList<Employee> empList;
	public static String searchResult;

	public static Connection initializeCon() {
		try {
			if (con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "M0nst3rF33t@3AM");
				PreparedStatement ps = con.prepareStatement("select * from emp");
				ResultSet rs = ps.executeQuery();
				empList.clear();
				while (rs.next()) {
					empList.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	};

	public static CallableStatement getCreate() throws ClassNotFoundException, SQLException {
		CallableStatement createEmp = con.prepareCall("call createEmployee(?,?,?,?)");
		return createEmp;
	}

	public static PreparedStatement getUpdate() throws ClassNotFoundException, SQLException {
		PreparedStatement updateEmp = con.prepareStatement("UPDATE emp SET firstname=?, lastname=?, age=? WHERE id=?");
		return updateEmp;

	}

	public static CallableStatement getDelete() throws ClassNotFoundException, SQLException {
		CallableStatement removeEmp = con.prepareCall("call removeEmployee(?)");
		return removeEmp;
	}

	public static CallableStatement getSearch() throws ClassNotFoundException, SQLException {
		CallableStatement searchEmp = con.prepareCall("call searchById(?)");
		return searchEmp;
	}

	public static String getData(Connection linked) throws SQLException {
		System.out.println(linked);
		PreparedStatement ps = linked.prepareStatement("select * from emp");

		ResultSet rs = ps.executeQuery();
		String s = "";
		while (rs.next()) {
			s = s + "(ID: " + rs.getInt(1) + ", First: " + rs.getString(2) + ", Last: " + rs.getString(3) + ", Age: "
					+ rs.getInt(4) + ") ";
		}
		return s;
	};

	public static void setResult(String result) {
		searchResult = result;
	}

	public static String getResult() {
		return searchResult;
	}
}

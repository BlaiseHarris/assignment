package com.saran.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import com.saran.model.Employee;

import cam.saran.DB.DatabaseConnect;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.CallableStatement;

import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/search")
public class SearchController extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
  		Connection con = DatabaseConnect.initializeCon();
		CallableStatement call = null;

		try {
			System.out.println(con);
			call = DatabaseConnect.getSearch();
			System.out.println(call);
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String id = req.getParameter("id");

		boolean gotId = req.getParameter("id") != null; // model

		if (gotId) {
			try {
				call.setInt(1, Integer.parseInt(id));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				ResultSet rs = call.executeQuery();
				if(rs.next()) {
					DatabaseConnect.setResult("ID: " + rs.getInt(1) + " | Firstname: " + rs.getString(2) + " | Lastname: " + rs.getString(3) + " | Age: " + rs.getInt(4));
					RequestDispatcher rd = req.getRequestDispatcher("searchSuccess.jsp");
					rd.forward(req, res);
				} else {
					RequestDispatcher rd = req.getRequestDispatcher("searchFail.jsp");
					rd.forward(req, res);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

}

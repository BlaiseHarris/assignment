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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//Controller-> Navigates between your model and view
@WebServlet("/delete")
public class RemoveController extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		Connection con = DatabaseConnect.initializeCon();
		CallableStatement call = null;
		
		try {
			call = DatabaseConnect.getDelete();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
        String id=req.getParameter("id");
        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String age=req.getParameter("age");
		 
		 boolean gotId=req.getParameter("id") != null; //model
		
		 if(gotId) {
			 try {
				call.setInt(1, Integer.parseInt(id));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 
			 try {
				call.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 
			 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			 rd.forward(req, res);
		 } 
		 else {
			 RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
			 rd.forward(req, res);
		 } 
	} 
		 protected void doGet(HttpServletRequest req,HttpServletResponse res)
					throws ServletException,IOException{
			 doPost(req,res);
		 }
	
}
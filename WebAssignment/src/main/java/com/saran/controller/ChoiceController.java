package com.saran.controller;

import java.io.IOException;
import java.io.PrintWriter;
import com.saran.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//Controller-> Navigates between your model and view
@WebServlet("/choice")
public class ChoiceController extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
//		 String id=req.getParameter("create");
//		 String firstName=req.getParameter("firstName");
//		 String lastName=req.getParameter("lastName");
//		 String age=req.getParameter("age");
		 
		 
		 boolean isCreate=req.getParameter("create") != null; //model
		 boolean isUpdate=req.getParameter("update") != null;
		 boolean isDelete=req.getParameter("delete") != null;
		 
		 if(isCreate) {
			 RequestDispatcher rd=req.getRequestDispatcher("createEmployee.jsp");
			 rd.forward(req, res);
		 } 
		 else if(isUpdate) {
			 RequestDispatcher rd=req.getRequestDispatcher("updateEmployee.jsp");
			 rd.forward(req, res);
		 } 
		 else if(isDelete) {
			 RequestDispatcher rd=req.getRequestDispatcher("removeEmployee.jsp");
			 rd.forward(req, res);
		 }
		 
//		 if(gotID && gotFirstName && gotLastName && gotAge) {
//			 RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
//			 rd.forward(req, res);
//		 }else {
//			 RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
//			 rd.forward(req, res);			 
//		 }
	} 
		 protected void doGet(HttpServletRequest req,HttpServletResponse res)
					throws ServletException,IOException{
			 doPost(req,res);
		 }
	
}

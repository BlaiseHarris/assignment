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
public class ChoiceController extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		boolean isCreate = req.getParameter("create") != null; // model
		boolean isUpdate = req.getParameter("update") != null;
		boolean isDelete = req.getParameter("delete") != null;
		boolean isSearch = req.getParameter("search") != null;

		if (isCreate) {
			RequestDispatcher rd = req.getRequestDispatcher("createEmployee.jsp");
			rd.forward(req, res);
		} else if (isUpdate) {
			RequestDispatcher rd = req.getRequestDispatcher("updateEmployee.jsp");
			rd.forward(req, res);
		} else if (isDelete) {
			RequestDispatcher rd = req.getRequestDispatcher("removeEmployee.jsp");
			rd.forward(req, res);
		} else if (isSearch) {
			RequestDispatcher rd = req.getRequestDispatcher("searchEmployee.jsp");
			rd.forward(req, res);
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

}

package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.service.StudentService;

public class StudentEditController extends HttpServlet {
//	private static Logger _log = LogManager.getLogManager().getLogger(StudentAddController.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		{
//			StudentService service = new StudentService();
//			boolean result = service.editStudent();
//			
//			if (result) {
//				RequestDispatcher rd = req.getRequestDispatcher("/student-list");
//				rd.forward(req, res);
//			} else {
//				req.setAttribute("errormessage", "Unable to add student details.");
//				RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
//				rd.forward(req, res);
//			}
//		}
	}
}

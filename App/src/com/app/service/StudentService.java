package com.app.service;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.app.bean.StudentBean;
import com.app.dao.StudentDAO;

public class StudentService {

	private static Logger _log = LogManager.getLogManager().getLogger(StudentService.class.getName());

	public List<StudentBean> getStudents() {

//		_log.log(Level.INFO, "StudentService.getStudents() is call...");
		StudentDAO studDAO = new StudentDAO();
		return studDAO.getStudents();
	}

	public boolean addStudent(StudentBean student) {

//		_log.log(Level.INFO, "StudentService.addStudent() is call...");
		StudentDAO studDAO = new StudentDAO();
		return studDAO.addStudent(student);
	}

	public StudentBean getStudentByStudentId(long studentId) {
		StudentDAO studDAO = new StudentDAO();
		return studDAO.getStudentByStudentId(studentId);
	}
}

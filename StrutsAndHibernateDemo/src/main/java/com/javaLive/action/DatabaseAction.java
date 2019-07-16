package com.javaLive.action;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javaLive.dao.StudentDAO;
import com.javaLive.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

public class DatabaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentID;
	private String studentName, studentAddress;
	private static final Logger logger = LoggerFactory.getLogger(DatabaseAction.class); // SLF4J
	public String list() throws Exception {
		return ActionSupport.SUCCESS;
	}

	public String insert() throws Exception {
		logger.info("In the insert method()");
		String result = null;
		Student s = new Student();
		s.setId(this.getStudentID());
		s.setName(this.getStudentName());
		s.setAddress(this.getStudentAddress());
		if (new StudentDAO().createStudent(s)) {
			return ActionSupport.SUCCESS;
		} else {
			return ActionSupport.ERROR;
		}
	}

	public String update() throws Exception {
		logger.info("In the update method()");
		String result = null;
		Student s = new Student();
		s.setId(this.getStudentID());
		s.setName(this.getStudentName());
		s.setAddress(this.getStudentAddress());
		if (new StudentDAO().updateStudent(s)) {
			return ActionSupport.SUCCESS;
		} else {
			return ActionSupport.ERROR;
		}
	}

	public String delete() throws Exception {
		logger.info("In the delete method()");
		String result=null;
		Student s=new Student();
		s.setId(this.getStudentID());
		s.setName(this.getStudentName());
		s.setAddress(this.getStudentAddress());
		if(new StudentDAO().deleteStudent(s)) {
		return  ActionSupport.SUCCESS;
		}
		else {
			return ActionSupport.ERROR;
		}
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void validate() {
		if (this.getStudentID() == 0) {
			addFieldError("studentID", "StudentID is required.");
		}

		if (this.getStudentName().equals("")) {
			addFieldError("studentName", "StudentName is required.");
		}

		if (this.getStudentAddress().equals("")) {
			addFieldError("studentAddress", "StudentAddress is required.");
		}
	}
}
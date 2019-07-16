package com.javaLive.action;

import java.util.Date;

import com.javaLive.dao.StudentDAO;
import com.javaLive.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

public class DatabaseAction extends ActionSupport {
	private int studentID;
	private String studentName, studentAddress;
	// @Override
	/*
	 * public String execute() throws Exception { this.setResult(number1+number2);
	 * return ActionSupport.SUCCESS; }
	 */

	public String list() throws Exception {
		return ActionSupport.SUCCESS;
	}

	public String insert() throws Exception {
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>ITaspirants Struts Example!!</title>
<s:head />
</head>

<body>
	<h1>
		<s:text name="Welcome to ITaspitants!!!!!!!!!!!!!!!!!" />
	</h1>
	<s:form action="testAction" method="post" name="myForm">
		<s:textfield key="Please Enter Student ID   " name="studentID" />
		<s:textfield key="Please Enter Student Name   " name="studentName" />
		<s:textfield key="Please Enter Student Address   " name="studentAddress" />
		<s:submit action="list" value="list" />
		<s:submit action="insert" value="insert" />
		<s:submit action="update" value="update" />
		<s:submit action="delete" value="delete" />
	</s:form>
</body>
</html>
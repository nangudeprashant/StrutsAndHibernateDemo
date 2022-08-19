<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
    User is 
    <s:property value="#session.user" /><br> 
	List of the students is as follows:
	<br><br>
	<table width="40%">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Address</th>
		</tr>
		<s:iterator value="#session.studentList">
			<!-- <fieldset> -->
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="address" /></td>
				</tr>
			<!-- </fieldset> -->
		</s:iterator>
	</table>
</body>
</html>
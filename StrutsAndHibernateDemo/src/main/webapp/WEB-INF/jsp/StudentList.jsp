<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Hi alll!!!!!!!!!!!!!!!!!!!!!!!!
	<s:property value="#session.user" />
	<s:iterator value="#session.studentList">
		<fieldset>
			<table width="40%">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="address" /></td>
				</tr>
			</table>
		</fieldset>
	</s:iterator>
	<%-- <s:iterator value="studentList">
		<s:property value="id" />
		<s:property value="name" />
		<s:property value="address" />
	</s:iterator> --%>
	<%-- 	<s:iterator value="studentList" var="student">
		<!-- here myList contains the list of objects -->
		<s:property value="%{#student.id}" />
		<br />
		<s:property value="%{#student.name}" />
		<br />
		<s:property value="%{#student.address}" />
	</s:iterator> --%>
</body>
</html>
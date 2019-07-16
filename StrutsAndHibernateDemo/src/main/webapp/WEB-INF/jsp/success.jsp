<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Success Screen !!</title>
    </head>
    <body>
           <p> Enterd numbers were: &nbsp; <s:property value="studentID" /> and &nbsp;<s:property value="studentName" />
            And the result is: <h3><s:property value="studentAddress" /></h3>
        </p>
    </body>
</html>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student information</title>
</head>
<body>
	<h2 align="center">Student information</h2>
	 <form:form method = "post" action = "/SpringMVCTAGLibrary/addstudent">
	<table align="center">
		<tr>
			<td>
				<form:label path="name">Name</form:label>
			</td>
			<td>
				<form:input path="name"></form:input>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="address">Address</form:label>
			</td>
			<td>
				<form:input path="address"></form:input>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="age">age</form:label>
			</td>
			<td>
				<form:input path="age"></form:input>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="submit"/>
			</td>
			<td>
				<input type="button" value="clear"/>
			</td>
		</tr>
	</table>
	</form:form>
</body>
</html>
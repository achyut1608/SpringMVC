<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Student information</h2>
	<table align="center" border="1">
		<tr>
			<td>
				Name
			</td>
			<td>
				${name}
			</td>
		</tr>
		<tr>
			<td>
				Address
			</td>
			<td>
				${address}
			</td>
		</tr>
		<tr>
			<td>
				Age
			</td>
			<td>
				${age}
			</td>
		</tr>
	</table>
</body>
</html>
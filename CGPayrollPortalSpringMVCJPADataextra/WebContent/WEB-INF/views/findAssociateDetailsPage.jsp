<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<form action="associateDetails" method="post">
			<table>
				<tr>
					<td>Associate Id</td>
					<td><input type="text" name="associateId"></td>
					<td><input type="submit" value="Click"></td>
					<td><a href="index">||Home||</a></td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center" class="error">${errorMessage}</div>
	<br>
	<br>
	<div align="center">
		<table>
			<tr>
				<th>AssociatedId</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EmailId</th>
			</tr>
			<tr>
				<td>${associate.associateId}</td>
				<td>${associate.firstName}</td>
				<td>${associate.lastName}</td>
				<td>${associate.emailId}</td>
			</tr>
		</table>
	</div>
</body>
</html>
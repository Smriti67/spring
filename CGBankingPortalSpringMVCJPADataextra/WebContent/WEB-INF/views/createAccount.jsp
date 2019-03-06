<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Create Account</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Account Details Here</h2>
		<table>
			<form:form action="createAccount" method="post"
				modelAttribute="account">
			
				<tr>
					<td>accountType:</td>
					<td><form:input path="accountType" size="30" /></td>
					<td><form:errors path="accountType" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td>accountBalance:</td>
					<td><form:input path="accountBalance" size="30" /></td>
					<td><form:errors path="accountBalance" cssClass="error"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
			</form:form>
		</table>
	</div>

</body>
</html>
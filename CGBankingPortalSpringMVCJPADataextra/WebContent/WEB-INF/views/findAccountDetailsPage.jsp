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
		<form action="accountDetails" method="post">
			<table>
				<tr>
					<td>Account No</td>
					<td><input type="text" name="accountNo"></td>
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
				<th>accountNo</th>
				<th>accountType</th>
				<th>accountBalance</th>
			</tr>
			<tr>
				<td>${account.accountNo}</td>
				<td>${account.accountType}</td>
				<td>${account.accountBalance}</td>
			</tr>
		</table>
	</div>
</body>
</html>
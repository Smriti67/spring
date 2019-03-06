<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
			<form:form action="registerAssociate" method="post"
				modelAttribute="associate">
				<tr>
					<td>FirstName:</td>
					<td><form:input path="firstName" size="30" /></td>
					<td><form:errors path="firstName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>LastName:</td>
					<td><form:input path="lastName" size="30" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>emailId:</td>
					<td><form:input path="emailId" size="30" /></td>
					<td><form:errors path="emailId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>yearlyInvestmentUnder80C:</td>
					<td><form:input path="yearlyInvestmentUnder80C" size="30" /></td>
					<td><form:errors path="yearlyInvestmentUnder80C"
							cssClass="error" /></td>
				</tr>
				<tr>
					<td>BankName:</td>
					<td><form:input path="bankDetails.bankName" size="30" /></td>
					<td><form:errors path="bankDetails.bankName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>AccountNo:</td>
					<td><form:input path="bankDetails.accountNumber" size="30" /></td>
					<td><form:errors path="bankDetails.accountNumber"
							cssClass="error" /></td>
				</tr>
				<tr>
					<td>IfscCode:</td>
					<td><form:input path="bankDetails.ifscCode" size="30" /></td>
					<td><form:errors path="bankDetails.ifscCode" cssClass="error" /></td>
				</tr>
				<tr>
					<td>basicSalary:</td>
					<td><form:input path="salary.basicSalary" size="30" /></td>
					<td><form:errors path="salary.basicSalary" cssClass="error" /></td>
				</tr>
				<tr>
					<td>hra:</td>
					<td><form:input path="salary.hra" size="30" /></td>
					<td><form:errors path="salary.hra" cssClass="error" /></td>
				</tr>
				<tr>
					<td>epf:</td>
					<td><form:input path="salary.epf" size="30" /></td>
					<td><form:errors path="salary.epf" cssClass="error" /></td>
				</tr>
				<tr>
					<td>CompanyPf:</td>
					<td><form:input path="salary.CompanyPf" size="30" /></td>
					<td><form:errors path="salary.CompanyPf" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
			</form:form>
		</table>
	</div>

</body>
</html>
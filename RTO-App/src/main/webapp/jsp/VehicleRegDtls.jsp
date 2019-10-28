<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #FF0000
}
</style>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script>
	$(function() {
		$('form[id="userRegForm"]').validate({
			rules : {
				username : 'required',
				password : {
					required : true,
					minlength : 6	
				},
				email : {
					required : true,
					email : true
				},
				phno : {
					required : true,
					minlength : 10,
					maxlength : 10
				}
			},
			messages : {
				username : 'PLEASE PROVIDE A VALID USER NAME',
				password : {
					required : 'PLEASE PROVIDE A VALID PASSWORD',
					minlength : 'PASSWORD SHOULD BE MORE THAN 5 '
				},
				email : {
					required : 'PLEASE PROVIDE A VALID MAIL-ID',
					email : 'PLEASE PROVIDE A VALID MAIL-ID'
				},
				phno : {
					required : 'PLEASE PROVIDE A VALID PHONENO',
					minlength : 'PLEASE PROVIDE 10 DIGIT MOBILE NUMBER ONLY',
					maxlength : 'PLEASE PROVIDE 10 DIGIT MOBILE NUMBER ONLY'
				},
			},
			submitHandler : function(form) {
				form.submit();
			}
		});
	});
</script>
</head>
<body>
	<div align="center">
	<form:form action="/vehicleRegDtls" method="POST" modelAttribute="vehicleRegDtls" id="vehicleRegDtlsForm">
		<table>
			<tr>
				<td colspan="2" align="center" ><h2>Welcome To Vehicle Registration Form</h2></td>
			</tr>
			<tr>
				<td>Vehicle Registration Date</td>
				<td><form:input path="vehicleRegDate" /></td>
			</tr>
			
			<tr>
				<td>Vehicle Registration Center</td>
				<td><form:input path="regCenter" /></td>
			</tr>
			
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Next" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><h2>${msg}</h2></td>
			</tr>
		
		</table>
	
	</form:form>
	
	</div>

</body>
</html>
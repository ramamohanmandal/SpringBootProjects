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
		$('form[id="onerDtlsForm"]').validate({
			rules : {
				firstName : 'required',
				lastName : 'required',
				dob : 'required',
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
				firstName : 'PLEASE ENTER YOUR FIRST NAME',
				lastName : 'PLEASE ENTER YOUR LAST NAME',
				dob : 'PLEASE PROVIDE YOUR DATE OF BIRTH',
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
	<form:form action="/RTO/ownerDtls" method="POST" modelAttribute="ownerDtls" id="ownerDtlsForm">
		<table>
			<tr>
				<td colspan="2" align="center" ><h2>Welcome To Vehicle Owner Registration Form</h2></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="M"/>Male 
					<form:radiobutton path="gender" value="F"/>Female </td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" Value="Next" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><h2>${msg}</h2></td>
			</tr>
		
		</table>
	
	</form:form>
	
	</div>
</body>
</html>
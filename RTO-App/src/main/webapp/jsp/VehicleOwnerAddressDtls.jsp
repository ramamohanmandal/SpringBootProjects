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
		$('form[id="vehicleOwnerAddressDtlsForm"]').validate({
			rules : {
				houseNumber : 'required',
				streetName : 'required',
				city : 'required',
				zip : 'required'
					
			},
			messages : {
				houseNumber : 'ENTER HOUSE NUMBER',
				streetName : 'ENTER STREET NAME ',
				city : 'ENTER CITY',
				zip : 'ENTER ZIP CODE'
					
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
	<form:form action="/vehicleOwnerAddressDtls" method="POST" modelAttribute="vehicleOwnerAddressDtls" id="vehicleOwnerAddressDtlsForm">
		<table>
			<tr>
				<td colspan="2" align="center" ><h2>Welcome To Vehicle Owner Address Registration Form</h2></td>
			</tr>
			<tr>
				<td>House Number</td>
				<td><form:input path="houseNumber" /></td>
			</tr>
			
			<tr>
				<td>Street Name</td>
				<td><form:input path="streetName" /></td>
			</tr>
			
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
			</tr>
			
			<tr>
				<td>Zip</td>
				<td><form:input path="zip" /></td>
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
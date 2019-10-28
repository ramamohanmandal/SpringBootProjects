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
		$('form[id="vehicleDtlsForm"]').validate({
			rules : {
				vehicleType : 'required',
				mfgYear : 'required',
				vehicleBrand : 'required',
					
			},
			messages : {
				vehicleType : 'ENTER YOUR VEHICLE TYPE',
				mfgYear : 'ENTER VEHICLES MANUFACTURING YEAR',
				vehicleBrand : 'ENTER YOUR VEHICLE BRAND'
					
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
	<form:form action="/RTO/vehicleDtlsc" method="POST" modelAttribute="vehicleDtls" id="vehicleDtlsForm">
		<table>
			<tr>
				<td colspan="2" align="center" ><h2>Welcome To Vehicle Details Form</h2></td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td><form:input path="vehicleType" /></td>
			</tr>
			
			<tr>
				<td>Manufacturing Year</td>
				<td><form:input path="mfgYear" /></td>
			</tr>
			
			<tr>
				<td>Vehicle Brand</td>
				<td><form:input path="vehicleBrand" /></td>
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
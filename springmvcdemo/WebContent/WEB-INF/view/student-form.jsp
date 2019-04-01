<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
		<style>
			.error{color:red}
		</style>
	</head>

	<body>
		<form:form action="processForm" modelAttribute = "student">
			First Name<form:input  path="firstName" />
			<br><br>
			Last Name(*): <form:input  path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			Country
			<form:select  path="country" >
				<form:options items = "${student.countryOptions}"/>
			</form:select>
			<br><br>
			Favorite Language:   
			Java<form:radiobutton path="favoriteLanguage" value="Java" />
			C#  <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			<br><br>
			Operating Systems:
			<br>
			Java<form:checkbox path="operatingSystems" value="Linux" />
			C#  <form:checkbox path="operatingSystems" value="Mac OS" />
			PHP <form:checkbox path="operatingSystems" value="Windows" />

			<br><br>
			Free Passes(*): <form:input  path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
			<br><br> 
			Postal Code: <form:input  path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
			<br><br>
			Course Code: <form:input  path="courseCode" />
			<form:errors path="courseCode" cssClass="error" />
			<br><br>
			<input type = "submit"  value ="Submit"/>
		</form:form>
	</body>
</html>
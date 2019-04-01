<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Reference JSTL TAG FOR COLLECTION // looping over a collection -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation Form</title>
	</head>

	<body>
		The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
		<br>
		Favorite Language: ${student.favoriteLanguage}  || Free Passes: ${student.freePasses} 
		<br><br>
		Postal Code: ${student.postalCode} 
		<br>
		Course Code: ${student.courseCode} 
		<br><br>
		Operating Language:
		<!--loop with jstl-->
		<ul>
			<c:forEach var = "temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>
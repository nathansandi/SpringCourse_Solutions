<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

	<head> 
		<title>
			Welcome
			
		</title>
	</head>
	<body>
		<h2>luv2code exercise home page</h2>
		<hr>
		<p>
		Welcome to the luc2code company web page!
		</p>
		
		<hr>
		
		<!-- Display username and role -->
		<p>
		  	User: <security:authentication property="principal.username" />
		  	<br>
		  	Role(s): <security:authentication property="principal.authorities" />
		</p>
		
		<hr>

		<security:authorize access="hasRole('MANAGERS')">
		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting </a>	
			 (Only for Manager peeps)
		</p>
		</security:authorize>
		<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath}/systems">Systems Meeting </a>	
			 (Only for Manager peeps)
		</p>
		</security:authorize>
		
		<form:form action="${pageContext.request.contextPath}/logout" 
							   method="POST">
			<input type="submit" value="Logout" />		
		</form:form>
		
	</body>

</html>

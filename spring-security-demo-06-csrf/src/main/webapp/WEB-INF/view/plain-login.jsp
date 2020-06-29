<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl para erro nos forms de login -->

<html>
<head>
	<title>Custom login page - Teste</title>
	
	<style>
		.failed{
			color:red;
		}
	</style>
</head>
<body>
	<h3>My Custom Login Page</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
	           method="POST">
	           
	    <!-- check error  -->
	    <c:if test="${param.error!=null}">
	    	<i class="failed">Erro no login, credentials are invalid</i>
	    </c:if>
	           
		<p>
			User name: <input type="text" name="username" />
		</p>
		
		<p>
			Password: <input type="password" name="password" />
		</p>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>
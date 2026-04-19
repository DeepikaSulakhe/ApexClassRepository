<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><h2>Register New Student</h2>

        <% String err = (String) request.getAttribute("error");
	   		if ("invalid".equals(err)) { %>
	    <div style="color:red;">
	        Username must contain only letters and password only letters and numbers.
	    </div>
		<% } %>

        <form action="${pageContext.request.contextPath}/registerAdmin" method="POST">

    <label>Username</label>
    <input type="text" name="username" required
           pattern="[A-Za-z]+"
           title="Username should contain only letters"
           placeholder="e.g. Admin">

    <label>Password</label>
    <input type="password" name="password" required
           pattern="[A-Za-z0-9]+"
           title="Password should contain only letters and numbers"
           placeholder="admin123">

    <div class="actions">
        <button type="submit" class="btn btn-primary"> Register</button>
        <a class="btn" href="${pageContext.request.contextPath}/login.jsp"> Cancel </a>
    </div>

</form>
</body>
</html>

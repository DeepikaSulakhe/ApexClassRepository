<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Student Portal</h2>

        <%-- Show error message if login failed --%>
        <% String error = (String) request.getAttribute("error");
           if (error != null) { %>
            <%= error %>
        <% } %>

        <form action="${pageContext.request.contextPath}/login" method="POST">
            <label>Username</label>
            <input type="text" name="username" required autofocus>

            <label>Password</label>
            <input type="password" name="password" required>
			<div>
            <button type="submit">Login</button>
            <a class="btn" href="${pageContext.request.contextPath}/registerAdmin.jsp">
               +RegisterAdmin</a>
            </div>
        </form>
</body>
</html>
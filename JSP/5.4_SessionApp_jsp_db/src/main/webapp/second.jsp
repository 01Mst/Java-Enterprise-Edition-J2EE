<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String qualification;
String designation;%>
<%
qualification=request.getParameter("qualification");
designation=request.getParameter("designation");
session.setAttribute("qualification",qualification);
session.setAttribute("designation",designation);
request.getRequestDispatcher("form3.html").forward(request, response);
%>

</body>
</html>
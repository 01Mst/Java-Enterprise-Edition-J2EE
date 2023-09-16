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
String name;
int age;%>
<%
name=request.getParameter("name");
age=Integer.parseInt(request.getParameter("age"));
session.setAttribute("name", name);
session.setAttribute("age",age);
request.getRequestDispatcher("form2.html").forward(request, response);
%>
</body>
</html>
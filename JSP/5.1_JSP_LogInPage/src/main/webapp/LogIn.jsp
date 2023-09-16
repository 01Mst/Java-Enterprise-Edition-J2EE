<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String username;
String password;
%>
<%
username=request.getParameter("username");
password=request.getParameter("password");  

if(username.equals("Thulasimani")&&password.equals("123")){
	out.println("LogIN Successfully---"+username);
}
else{
	out.println("LogIn Failed-->Try with valid data!");
}
%>
<br>
User Name:<%=username %><br>
Password :<%=password %>
</body>
</html>
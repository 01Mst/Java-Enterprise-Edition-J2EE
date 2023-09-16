<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
Connection connection;
PreparedStatement ps;%>

<%

Class.forName("oracle.jdbc.driver.OracleDriver");
connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","58813");

ps=connection.prepareStatement("insert into user_details values(?,?,?,?,?,?)");

ps.setString(1,session.getAttribute("name").toString());
ps.setInt(2,(Integer)session.getAttribute("age"));
ps.setString(3,session.getAttribute("qualification").toString());
ps.setString(4,session.getAttribute("designation").toString());
ps.setString(5,request.getParameter("mobile"));
ps.setString(6,request.getParameter("email"));
ps.executeUpdate();
out.println("Data Inserted Successfully!");
%>

</body>
</html>
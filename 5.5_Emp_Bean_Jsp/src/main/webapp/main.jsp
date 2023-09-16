<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!int eid;
   String ename;
   double esal;
   %>
<% eid=Integer.parseInt(request.getParameter("eid"));
    ename=request.getParameter("ename");
    esal=Double.parseDouble(request.getParameter("esal"));%>  
    <jsp:useBean id="eb" class="bean.EmpBean" scope="application"/>
    
    <jsp:setProperty property="eid" name="eb" value="<%=eid %>"/>
    <jsp:setProperty property="ename" name="eb" value="<%=ename %>"/>
    <jsp:setProperty property="esal" name="eb" value="<%=esal %>"/> 
   
Employee ID    : <jsp:getProperty property="eid" name="eb"/><br><br> 
Employee Name  : <jsp:getProperty property="ename" name="eb"/><br><br>
Employee Salary: <jsp:getProperty property="esal" name="eb"/><br><br>   
</body>
</html>
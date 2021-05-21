<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>jspPage1.jsp</h1>
Today is: <%= java.util.Calendar.getInstance().getTime() %>
<%@ include file="footer.jsp" %>
</body>
</html>
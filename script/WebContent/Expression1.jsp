<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Expression Example1</h1>
<%!
	String name[] = {"Java", "JSP", "Android", "Struts"};
%>
<table border : 1px solid black; width : 200px;>
<% for (int i=0; i<name.length; i++){%>
<tr>
<td><%=i%></td>
<td><%=name[i] %></td>
</tr>
<%} %>
</table>
</body>
</html>
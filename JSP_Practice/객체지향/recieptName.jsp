<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String userBrowser = request.getHeader("User-Agent");

if(userBrowser.contains("Chrome") ){
	System.out.println("크롬");
	userBrowser = "크롬";
}
else{
	System.out.println("익스플로어");
	userBrowser = "익스플로어";
}
%>
<%=name %>님께서 사용하시는 브라우저는 <%=userBrowser%>입니다.
</body>
</html>
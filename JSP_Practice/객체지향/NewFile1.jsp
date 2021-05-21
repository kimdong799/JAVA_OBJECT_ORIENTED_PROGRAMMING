<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--hello라는 이름으로  객체 생성 -->
	<jsp:useBean class="jsp_code.beans.HelloBean" id="hello" />
	
	<!-- 멤버변수 호출 -->
	<jsp:getProperty property="name" name="hello"/><br>
	<jsp:getProperty property="number" name="hello"/><br>
	
	<!-- 변수 초기화 -->
	<jsp:setProperty property="name" name="hello" value="hlee"/><br>
	<jsp:setProperty property="number" name="hello" value="12345"/><br>
	
	<hr>
	
	<!-- 변수를 다시 출력 -->
	
	<jsp:getProperty property="name" name="hello"/><br>
	<jsp:getProperty property="number" name="hello"/><br>
</body>
</html>
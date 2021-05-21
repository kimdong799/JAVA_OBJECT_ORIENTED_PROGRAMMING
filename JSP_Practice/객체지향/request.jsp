<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- process.jsp파일로 값을 입력받아 전달하는 의미 -->
	<form action = "process.jsp" method="post">
		<p>아 이 디 : <input type="text" name="id">
		<p>비밀번호 : <input type="text" name="password">
		<p><input type = "submit" value = "전송">
	</form>
</body>
</html>
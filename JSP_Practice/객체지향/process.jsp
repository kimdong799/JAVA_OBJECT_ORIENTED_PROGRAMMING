<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- input태그에서 받아온 값을 출력 -->
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("id");
		String password = request.getParameter("password");
	%>
	<p> 당신의 ID : <%=userid%>
	<p> 당신의 PW : <%=password%>
	
	<!-- out 내장객체 사용 -->
	<p><strong>out내장객체 사용 반환입니다.</strong>
	<p> 아 이 디 :<%out.println(userid); %>
	<p> 비밀번호 :<%out.println(password); %>
	<%
		String protocol = request.getProtocol();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String remoteAddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		String method = request.getMethod();
		StringBuffer requestURL = request.getRequestURL();
		String requestURI = request.getRequestURI();
		String userBrowser = request.getHeader("User-Agent");
		String fileType = request.getHeader("Accept");
	%>
	<hr>
	<h1>웹브라우저/서버 관련 정보 반환</h1>
	프로토콜 : <%=protocol %><p>
	서버의 이름 : <%=serverName %><p>
	서버의 포트 번호 : <%=serverPort %><p>
	사용자 컴퓨터의 주소 : <%=remoteAddr %><p>
	사용자 컴퓨터의 이름 : <%=remoteHost %><p>
	사용자 method : <%=method %><p>
	요청 경로(URL) : <%=requestURL %><p>
	요청 경로(URI) : <%=requestURI %><p>
	현재 사용하는 브라우저 : <%=userBrowser %><p>
	브라우저가 지원하는  file의 type : <%=fileType %><p>

</body>
</html>
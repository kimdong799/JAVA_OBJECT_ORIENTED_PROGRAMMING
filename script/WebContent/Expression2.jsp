<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Expression Example2</h1>
<!-- 날짜를 가져오고 시간을 가져오는 함수 사용 -->
<%
	java.util.Date date = new java.util.Date();
	int hour = date.getHours();
	int one=10;
	int two=12;
%>
<!-- operation method
i>j ? i:j 의 뜻은  i가 크다면 i가 리턴, 거짓이면 j를 리턴-->
<%!
	public int operation(int i, int j){
	return i > j ? i : j;
}
%>
<!-- -->

지금은 오전일까요 오후일까요?<%=(hour<12)? "오전":"오후" %><p>
one과 two 둘 중에 큰 숫자는? <%=operation(one,two) %>
</body>
</html>
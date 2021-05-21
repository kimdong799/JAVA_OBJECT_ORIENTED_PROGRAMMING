<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GUGUDAN</h1>
<h2>60161051 김동현</h2>
<%
	int n;
	java.util.Random r = new java.util.Random();
	n=r.nextInt(9)+1;
	if(n==1){
		while(true){
			n=r.nextInt(9)+1;
			if(n>1) break;
		}
	}
%>
구구단 <%=n%> 단<p>
<%
	for(int i=1; i<10; i++){
		out.println(n+" X "+i+" = "+n*i);%><br><%
}%>

</body>
</html>
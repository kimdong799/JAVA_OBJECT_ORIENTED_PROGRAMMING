<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>For Example</h1>
1부터 10까지의 합은?<p>
<%
	int i,sum=0;
	for(i=1;i<=10;i++){
		if(i<10){
			out.println(i+" +");
		}
		else{
			out.println(i+"=");
		}
		sum+=i;
	}
%>
<%=sum %>
</body>
</html>
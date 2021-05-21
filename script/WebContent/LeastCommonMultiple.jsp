<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Least Common Multiple</h1>
<h2>60161051 김동현</h2>
<%!
	int min=0;
	int num1,num2;
%>
<%
	java.util.Random r= new java.util.Random();
	num1 = r.nextInt(100);
	num2 = r.nextInt(100);
	
	for(int i=1; i<=num1 && i<=num2; i++){
		if(num1%i==0 && num2%i==0){
			min=i;
		}
	}
	int leastCommonMultiple = num1*num2/min;
%>
"<%=num1 %>와(과) <%=num2 %>의 최소공배수는 <%=leastCommonMultiple %>입니다."
</body>
</html>
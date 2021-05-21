<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.Statement" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB Connector.jsp</title>
<style>
	table{
	width: 80%;
	border: 1px solid black;
	}
	td{
	width: 10%;
	}
	tr{
	height: 60px;
	}
	.head{
	background:gray;
	}
</style>
</head>
<body>
	<%
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("org.MySQL_code.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "@gh14041404");
		
		stmt = con.createStatement();
		String sql = "select * from user";
		rs = stmt.executeQuery(sql);
		
		out.print("<table class=head><tr><td>이름</td><td>아이디</td><td>비밀번호</td><td>주소</td></tr></table>");

		if(rs.next()){
			do{
				out.print("<table>");
			   	out.print("<tr>");
			   	out.print("<td>" + rs.getString("name") + "</td>");
			   	out.print("<td>" + rs.getString("id") + "</td>");
			   	out.print("<td>" + rs.getString("password") + "</td>");
			   	out.print("<td>" + rs.getString("address") + "</td>");
			   	out.print("</tr");
				out.print("</table>");
			}while(rs.next());


		} else{
			out.print("결과가 없습니다.");
		}
		System.out.println("성공");
		
		con.close();
		
	} catch(SQLException e1){
		out.print(e1);
		System.out.println("실패");
	} catch(Exception e){
		out.print(e);
	}
	%>
</body>
</html>
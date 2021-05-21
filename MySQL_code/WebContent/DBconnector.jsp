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
		String sql = "select * from member";
		rs = stmt.executeQuery(sql);
		
		if(rs.next()){
			do{
				out.print("<br>");
				out.print(rs.getString("id")+" ");
				out.print(rs.getString("name")+" ");
				out.print(rs.getString("passwd"));
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
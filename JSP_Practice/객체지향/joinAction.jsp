<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 정보를 DB에 저장합니다.</h1>
	<%
	request.setCharacterEncoding("utf-8");
	String UserName = request.getParameter("UserName");
	String UserID = request.getParameter("UserID");
	String UserPassword = request.getParameter("UserPassword");
	String UserAddress = request.getParameter("UserAddress");
	
	Connection con = null; // 연결에 대한 관리용 객체 생성
	PreparedStatement pstmt = null;
	
	try {	
		Class.forName("org.MySQL_code.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "@gh14041404");
		//SQL 쿼리 입력
		String sql = "INSERT INTO USER(ID, PASSWORD, ADDRESS, NAME) VALUES('" + UserID 
				+ "','" + UserPassword + "', '" + UserAddress + "', '" + UserName + "')";
		pstmt = con.prepareStatement(sql);
		System.out.println("SQL 성공: "+con);
		pstmt.executeUpdate();
	}
	catch(SQLException ex) {
		System.out.println("SQLException"+ex);
	}catch(Exception ex) {
		System.out.println("Exception"+ex.getMessage());
	}
	%>
</body>
</html>
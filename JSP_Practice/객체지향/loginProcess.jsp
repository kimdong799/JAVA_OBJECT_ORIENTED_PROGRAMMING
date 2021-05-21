<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css"/>
</head>
<body>
<h1>60161051 김동현 로그인 페이지 정보</h1>
<th>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String studentNo = request.getParameter("studentNo");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String confirmedPw = request.getParameter("confirmedPw");
		String headEmail = request.getParameter("headEmail");
		String tailEmail = request.getParameter("tailEmail");
		String selboxDirect = request.getParameter("selboxDirect");
		String CellphoneNoHead = request.getParameter("CellphoneNoHead");
		String cellPhoneNoBody = request.getParameter("cellPhoneNoBody");
		String cellPhoneNoTail = request.getParameter("cellPhoneNoTail");
		String housePhoneNoHead = request.getParameter("housePhoneNoHead");
		String housePhoneNoBody = request.getParameter("housePhoneNoBody");
		String housePhoneNoTail = request.getParameter("housePhoneNoTail");
		String addressNo = request.getParameter("addressNo");
		String address = request.getParameter("address");
		String chk_info = request.getParameter("chk_info");
	%>
	
	<table>
	<thead>
        <tr>
          <th>정보 입력시간</th>
          <th><%= java.util.Calendar.getInstance().getTime() %></th>
        </tr>
      </thead>
	<tbody>
		<tr>
			<th>이름 </th>
			<td><%=name%></td>
		</tr>
		<tr>
			<th>학번 </th>
			<td><%=studentNo%></td>
		</tr>
		<tr>
			<th>ID</th>
			<td><%=id%></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><%=pw%></td>
		</tr>
		<tr>
			<th>확인PW</th>
			<td><%=confirmedPw%></td>
		</tr>
	<%
	if(tailEmail.contains("direct")){
		tailEmail=selboxDirect;
	}
	%>
		<tr>
			<th>이메일 </th>
			<td><%=headEmail+"@"+tailEmail %></td>
		</tr>
		<tr>
			<th>휴대전화</th>
			<td> <%=CellphoneNoHead+ "-" + cellPhoneNoBody+"-" + cellPhoneNoTail%></td>
		</tr>
		<tr>
			<th>전화번호 </th>
			<td><%=housePhoneNoHead+ "-" + housePhoneNoBody+"-" + housePhoneNoTail %></td>
		</tr>
		<tr>
			<th>우편번호</th>
			<td><%=addressNo %></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><%=address %></td>
		</tr>
		<%
		if(chk_info==null){
			chk_info="정보수신 미동의";
		}
		%>
		<tr>
			<th>정보수신 여부</th>
			<td><%=chk_info %></td>
		</tr>
		</tbody>
	</table>
	
</body>
</html>
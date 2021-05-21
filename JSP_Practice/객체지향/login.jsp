<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
 <link rel="stylesheet" href="style.css"/>
</head>
<body>
<form action = "joinAction.jsp" method="post">
    <table>
      <thead>
        <tr>
          <th>😃기본정보</th>
          <th>정보를 입력하세요.</th>
        </tr>
      </thead>
      <tbody>
      <tr>
        <th>✔ 이름</th>
        <td><input type="text" name="UserName"></td>
      </tr>
      <tr>
        <th>✔ 학번</th>
        <td><input type="text" name="studentNo"></td>
      </tr>
      <tr>
        <th>✔ 아이디</th>
        <td><input type="text" name="UserID">
        <button type= "button">아이디중복확인</button></td>
      </tr>
      <tr>
        <th>✔ 비밀번호</th>
        <td><input type="password" name="UserPassword"></td>
      </tr>
      <tr>
        <th>✔ 비밀번호 확인</th>
        <td><input type="password" name="confirmedPw"></td>
      </tr>
      <tr>
        <th>✔ 이메일</th>
        <td><input type="text" name="headEmail">@
          <select name="tailEmail">
            <option value="direct">직접입력</option>
            <option value="gamil.com" selected>gamil.com</option> <!--기본값으로 지정-->
            <option value="naver.com">naver.com</option>
            <option value="hanmail.com">hanmail.net</option>
            </select>
            <input type="text" id="selboxDirect" name="selboxDirect"/>
        </td>
      </tr>
      <tr>
        <th rowspan="2">✔ 연락처</th>
        <td>
          휴대전화
          <select name="CellphoneNoHead">
          <option selected>-선택하세요-</option> <!--기본값으로 지정-->
          <option >010</option>
          <option >011</option>
          </select>
          -
          <input type="text" name="cellPhoneNoBody" size=5>
          -
          <input type="text" name="cellPhoneNoTail" size=5>

        </td>
      </tr>
      <tr>
        <td>
          일반전화
          <select name="housePhoneNoHead">
          <option selected>-선택하세요-</option> <!--기본값으로 지정-->
          <option >02</option>
          <option >031</option>
          <option >043</option>
          </select>
          -
          <input type="text" name="housePhoneNoBody" size=5>
          -
          <input type="text" name="housePhoneNoTail" size=5>
        </td>
      </tr>
      <tr>
        <th>✔ 우편번호</th>
        <td><input type="text" name="addressNo">
          <button type="button" name="button"><a href="https://www.juso.go.kr/openIndexPage.do" target=_blank, title="도로명주소">🔍 주소찾기</a></button>
        </td>
      </tr>
      <tr>
        <th>✔ 주소</th>
        <td><input type="text" name="UserAddress" size=80%></td>
      </tr>
      <tr>
        <th>✔ 정보수신 여부</th>
        <td>
          서비스 및 이벤트 소식을
          <input type="checkbox" name="chk_info" value=Email>Emil로 수신하겠습니다.
            <input type="checkbox" name="chk_info" value=SNS>SNS로 수신하겠습니다.
        </td>
      </tr>
    </tbody>
    </table>
    <p>
    <input type="submit" value="제출">
    </p>
    </form>
</body>
</html>
package org.MySQL_code;

import java.sql.*;

// 자바코드로 DB에 접속하는 코드

public class DriverTest {


	public static void main(String[] args) {
		Connection con = null; // 연결에 대한 관리용 객체 생성
		try {	
			Class.forName("org.MySQL_code.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "@gh14041404");
			System.out.println("성공: "+con);
		}
		catch(SQLException ex) {
			System.out.println("SQLException"+ex);
		}catch(Exception ex) {
			System.out.println("Exception"+ex.getMessage());
		}
			
	}

}

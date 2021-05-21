package org.MySQL_code;

import java.sql.*;

public class DriverSQL {

	// DB 연결 로직
	public static void main(String[] args) {
		Connection con = null; // 연결에 대한 관리용 객체 생성
		PreparedStatement pstmt = null;
		
		try {	
			Class.forName("org.MySQL_code.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "@gh14041404");
			//SQL 쿼리 입력
			String sql = "delete from product where price < 1000;";
			pstmt = con.prepareStatement(sql);
			System.out.println("SQL 성공: "+con);
			pstmt.executeUpdate();
		}
		catch(SQLException ex) {
			System.out.println("SQLException"+ex);
		}catch(Exception ex) {
			System.out.println("Exception"+ex.getMessage());
		}
			
	}
}

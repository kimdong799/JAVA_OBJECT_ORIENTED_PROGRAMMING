package JOB_INFO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class job_info_DAO {
	
	private Connection con;
	private ResultSet rs;
	
	public job_info_DAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
			String dbID = "root";
			String dbPassword = "@gh14041404";
			
			Class.forName("org.MySQL_code.Driver");
			con = DriverManager.getConnection(dbURL, dbID, dbPassword);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 글쓴 시간 가져오는 함수
	public String getDate() {
		String SQL = "SELECT NOW()";
		try {
			PreparedStatement pstmt = con.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ""; // DB오류
	}
	// 게시물 번호 정해주는 함수
	public int getNext() {
		String SQL = "SELECT job_info_id FROM job_info ORDER BY job_info_id DESC";
		try {
			PreparedStatement pstmt = con.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1; // 첫 번째 게시물인 경우
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // DB오류
	}
	
	// 글을 작성하는 함수
	public int write(String job_info_title, String job_info_content) {
		String SQL = "INSERT INTO job_info VALUES(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, job_info_title);
			//pstmt.setString(3, user_id);
			pstmt.setString(3, job_info_content);
			pstmt.setString(4, getDate());
			pstmt.setInt(5, 1);
			
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // DB오류
	}
}

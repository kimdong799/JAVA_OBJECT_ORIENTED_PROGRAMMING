package user;

import java.sql.*;

public class UserDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private static UserDAO instance;
	public UserDAO() { 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentos?useSSL=false", "root", "@gh14041404");
			System.out.println("성공 : " + conn);
		} catch (SQLException ex) {
			System.out.println("SQLException" + ex);
		} catch (Exception ex) {
			System.out.println("Exception" + ex.getMessage());
		}
	}
	public static UserDAO getInstance() {
		if(instance == null)
			instance = new UserDAO();
		return instance;
	}
	public int registerCheck(String userID) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "SELECT * FROM USER WHERE userID = ?";

		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if (rs.next() || userID.equals("")) { //결과가 이미 존재한다면
				return 0; // 이미 존재하는 회원 ID이거나 입력하지 않을 경우
				
			} else {
				return 1; // 가입 가능한 회원 아이디
			}
		} catch (Exception e) { 	
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) 
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1; // 데이터 베이스 오류
	}
	
	public int userNumberCheck(String userNumber) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "SELECT * FROM studentNumber WHERE userNumber = ?";

		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userNumber);
			
			rs = pstmt.executeQuery();
			
			if (rs.next() || userNumber.equals("")) {
				
				return 0; // 이미 존재하는 회원 ID이거나 입력하지 않을 경우
				
			} else {
				return 1; // 가입 가능한 회원 아이디
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) 
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1; // 데이터 베이스 오류
	}

	public int register(String userID,String userPassword,String userName,
			String userNumber,String userAge,String userGender,String userEmail) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "INSERT INTO USER VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID); // 유저에서 얻어온 값 받음
			pstmt.setString(2, userPassword);
			pstmt.setString(3, userName);
			pstmt.setInt(4,Integer.parseInt(userNumber)); //문자열을 숫자로 변환
			pstmt.setInt(5,Integer.parseInt(userAge));
			pstmt.setString(6, userGender);
			pstmt.setString(7, userEmail);

			return pstmt.executeUpdate(); // 업데이트 하면서 DB에 데이터 값을 추가로 넣음
		} catch (Exception e) { // 성공적으로 반환되면 return값으로 1이 반환됨
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1; // 데이터베이스 오류
	}
	
	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword FROM USER WHERE userID =?";
		try {
			pstmt =conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1; //로그인 성공
				}
				else
					return 0 ; // 비밀번호 불일치
			}
			return -1; //아이디 없음
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -2; //db오류
	}
}
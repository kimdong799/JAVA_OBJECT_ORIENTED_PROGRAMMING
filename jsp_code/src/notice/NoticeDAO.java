package notice;

import java.sql.*;
import java.util.ArrayList;

public class NoticeDAO {

	private Connection conn;
	
	private ResultSet rs;
	
	public NoticeDAO() {
		try {
			String dbURL ="jdbc:mysql://localhost:3306/mentos?useSSL=false";
			String dbID ="root";
			String dbPassword ="@gh14041404";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDate() {
		String SQL ="SELECT NOW()"; //현재시간을 가져옴
		
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ""; //데베 오류
	}
	
	public int getNext() {
		String SQL ="SELECT noticeID FROM notice ORDER BY noticeID DESC";
		
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1)+1;
			}
			return 1; //첫번째 게시물인 경우
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데베 오류
	}
	
	public int write(String noticeTitle, String userID, String noticeContent) {
		String SQL ="INSERT INTO notice VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, noticeTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, getDate());
			pstmt.setString(5, noticeContent);
			pstmt.setInt(6, 1);
		
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데베 오류
	}
	
	public ArrayList<Notice> getList(int pageNumber) {
		String SQL ="SELECT * FROM NOTICE WHERE noticeID < ? AND noticeAvailable = 1 ORDER BY noticeID DESC LIMIT 10";
		ArrayList<Notice> list = new ArrayList<Notice>();
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext() - (pageNumber - 1)*10);
			
			rs = pstmt.executeQuery();
		    while(rs.next()) {
		    	Notice notice = new Notice();
		    	notice.setNoticeID(rs.getInt(1));
		    	notice.setNoticeTitle(rs.getString(2));
		    	notice.setUserID(rs.getString(3));
		    	notice.setNoticeDate(rs.getString(4));
		    	notice.setNoticeContent(rs.getString(5));
		    	notice.setNoticeAvailable(rs.getInt(6));
		    	list.add(notice);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list; //페이지 리스트가 담겨 출력
	}
	
	public boolean nextPage(int pageNumber) { //페이징처리 (게시글 10개면 1개, 11개면 2개,,)
		String SQL ="SELECT * FROM notice WHERE noticeID < ? AND noticeAvailable = 1";
		
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			pstmt.setInt(1, getNext() - (pageNumber - 1)*10);
			
			rs = pstmt.executeQuery();
		    if (rs.next()) {
		    	return true;
		    	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Notice getNotice(int noticeID) {
		String SQL ="SELECT * FROM notice WHERE noticeID = ?";
		
		try {
			PreparedStatement pstmt =conn.prepareStatement(SQL);
			pstmt.setInt(1, noticeID);
			rs = pstmt.executeQuery();
			
		    if (rs.next()) {
		    	Notice notice = new Notice();
		    	notice.setNoticeID(rs.getInt(1));
		    	notice.setNoticeTitle(rs.getString(2));
		    	notice.setUserID(rs.getString(3));
		    	notice.setNoticeDate(rs.getString(4));
		    	notice.setNoticeContent(rs.getString(5));
		    	notice.setNoticeAvailable(rs.getInt(6));
		    	return notice;
		    	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}


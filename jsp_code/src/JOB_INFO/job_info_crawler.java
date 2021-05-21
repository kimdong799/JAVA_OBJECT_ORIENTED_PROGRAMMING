package JOB_INFO;

import java.sql.*;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class job_info_crawler{
	
	public static void erp_scrap() throws IOException {
		// ERP 직종
        String articleURL = "http://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_key=40915%2C40912&panel_type=&search_optional_item=n&search_done=y&panel_count=y"; // 사람인 URL
        Document doc = Jsoup.connect(articleURL).get();     // document 객체 생성.
        Elements ele = doc.select("div.list_body");          // 아이디가 _article인 div 태그 선택
        Elements links = doc.select("a.str_tit[href]");
        
      //Iterator을 사용하여 하나씩 값 가져오기
      	Iterator<Element> ie1 = ele.select("a.str_tit").iterator();
      	Iterator<Element> ie2 = ele.select("div.job_tit > a").iterator();
      	Iterator<Element> ie3 = ele.select("div.recruit_condition").iterator();
      	
      	
      	String ie4 = links.attr("href");
      	
//      	for (Element link : links) {
//
//            // get the value from href attribute
//            System.out.println("\nlink : " + link.attr("href"));
//            System.out.println("text : " + link.text());
//      	
 
      	
//      	while (ie1.hasNext()) {
//			System.out.println(ie1.next().text()+"\t"+ie2.next().text()+"\t"+ie3.next().text());
//		}
      	Connection con = null; // 연결에 대한 관리용 객체 생성
		PreparedStatement pstmt = null;
		
		try {	
			Class.forName("org.MySQL_code.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentos?useSSL=false", "root", "@gh14041404");
			//SQL 쿼리 입력
			
			String sql1 = "DROP TABLE ERP_INFO";
			pstmt = con.prepareStatement(sql1);
			pstmt.executeUpdate();
			
			
			String sql2 = "CREATE TABLE ERP_INFO(INFO_NUM INT NOT NULL AUTO_INCREMENT, TITLE VARCHAR(50), BODY VARCHAR(70), QUALIFICATION VARCHAR(50), PRIMARY KEY(INFO_NUM))";
			pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();
			
			while (ie1.hasNext()) {
				
				String sql = "INSERT INTO erp_info (title, body, qualification) VALUES (?, ?, ?)";
				
				pstmt = con.prepareStatement(sql);
			
				pstmt.setString(1, (ie1.next().text()));
				pstmt.setString(2, (ie2.next().text()));
				pstmt.setString(3, (ie3.next().text()));
				pstmt.executeUpdate();
			}
			System.out.println("SQL 성공: "+con);
		}
		catch(SQLException ex) {
			System.out.println("SQLException"+ex);
		}catch(Exception ex) {
			System.out.println("Exception"+ex.getMessage());
		}
	}
	
	public static void bigdata_scrap() throws IOException {
			// ERP 직종
	        String articleURL = "http://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_key=41702%2C41709%2C41703%2C41706&panel_type=&search_optional_item=n&search_done=y&panel_count=y"; // 사람인 URL
	        Document doc = Jsoup.connect(articleURL).get();     // document 객체 생성.
	        Elements ele = doc.select("div.list_body");          // 아이디가 _article인 div 태그 선택
	        
	      //Iterator을 사용하여 하나씩 값 가져오기
	      	Iterator<Element> ie1 = ele.select("a.str_tit").iterator();
	      	Iterator<Element> ie2 = ele.select("div.job_tit > a").iterator();
	      	Iterator<Element> ie3 = ele.select("div.recruit_condition").iterator();
	      	
//	      	while (ie1.hasNext()) {
//				System.out.println(ie1.next().text()+"\t"+ie2.next().text()+"\t"+ie3.next().text());
//			}
	      	Connection con = null; // 연결에 대한 관리용 객체 생성
			PreparedStatement pstmt = null;
			
			try {	
				Class.forName("org.MySQL_code.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentos?useSSL=false", "root", "@gh14041404");
				//SQL 쿼리 입력
				
				String sql1 = "DROP TABLE BIGDATA_INFO";
				pstmt = con.prepareStatement(sql1);
				pstmt.executeUpdate();
				
				String sql2 = "CREATE TABLE BIGDATA_INFO(INFO_NUM INT NOT NULL AUTO_INCREMENT, TITLE VARCHAR(50), BODY VARCHAR(70), QUALIFICATION VARCHAR(50), PRIMARY KEY(INFO_NUM))";
				pstmt = con.prepareStatement(sql2);
				pstmt.executeUpdate();
				
				while (ie1.hasNext()) {
					
					String sql = "INSERT INTO BIGDATA_INFO (title, body, qualification) VALUES (?, ?, ?)";
					
					pstmt = con.prepareStatement(sql);
				
					pstmt.setString(1, (ie1.next().text()));
					pstmt.setString(2, (ie2.next().text()));
					pstmt.setString(3, (ie3.next().text()));
					pstmt.executeUpdate();
				}
				System.out.println("SQL 성공: "+con);
			}
			catch(SQLException ex) {
				System.out.println("SQLException"+ex);
			}catch(Exception ex) {
				System.out.println("Exception"+ex.getMessage());
			}
		}
	
	public static void frontend_scrap() throws IOException {
		// ERP 직종
        String articleURL = "http://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_cd=413&panel_type=&search_optional_item=n&search_done=y&panel_count=y"; // 사람인 URL
        Document doc = Jsoup.connect(articleURL).get();     // document 객체 생성.
        Elements ele = doc.select("div.list_body");          // 아이디가 _article인 div 태그 선택
        
      //Iterator을 사용하여 하나씩 값 가져오기
      	Iterator<Element> ie1 = ele.select("a.str_tit").iterator();
      	Iterator<Element> ie2 = ele.select("div.job_tit > a").iterator();
      	Iterator<Element> ie3 = ele.select("div.recruit_condition").iterator();
      	
//      	while (ie1.hasNext()) {
//			System.out.println(ie1.next().text()+"\t"+ie2.next().text()+"\t"+ie3.next().text());
//		}
      	Connection con = null; // 연결에 대한 관리용 객체 생성
		PreparedStatement pstmt = null;
		
		try {	
			Class.forName("org.MySQL_code.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentos?useSSL=false", "root", "@gh14041404");
			//SQL 쿼리 입력
			
			String sql1 = "DROP TABLE FRONTEND_INFO";
			pstmt = con.prepareStatement(sql1);
			pstmt.executeUpdate();
			
			String sql2 = "CREATE TABLE FRONTEND_INFO(INFO_NUM INT NOT NULL AUTO_INCREMENT, TITLE VARCHAR(50), BODY VARCHAR(70), QUALIFICATION VARCHAR(50), PRIMARY KEY(INFO_NUM))";
			pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();
			
			while (ie1.hasNext()) {
				
				String sql = "INSERT INTO FRONTEND_INFO (title, body, qualification) VALUES (?, ?, ?)";
				
				pstmt = con.prepareStatement(sql);
			
				pstmt.setString(1, (ie1.next().text()));
				pstmt.setString(2, (ie2.next().text()));
				pstmt.setString(3, (ie3.next().text()));
				pstmt.executeUpdate();
			}
			System.out.println("SQL 성공: "+con);
		}
		catch(SQLException ex) {
			System.out.println("SQLException"+ex);
		}catch(Exception ex) {
			System.out.println("Exception"+ex.getMessage());
		}
	}

    public static void main(String[] args) throws IOException{
    	
    	erp_scrap();
    	bigdata_scrap();
    	frontend_scrap();
	}
}
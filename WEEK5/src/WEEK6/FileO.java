package WEEK6;

import java.io.*; //input, output 약자.
import java.util.Scanner;

public class FileO {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Kim\\Documents\\out.txt"); // File객체의 첫 생성자에 경로명을 입력.
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {//has next는 계속 읽어 들여올 텍스트가 있는가를 확인하는 메소드
				System.out.println(s.next());//스페이스로 구분된 단어단위로 계속 출력
			}
			s.close();//파일 닫기
		}catch(FileNotFoundException err) {
			//파일이 없을 경우
			System.out.println("파일이 없습니다.");
		}

	}

}

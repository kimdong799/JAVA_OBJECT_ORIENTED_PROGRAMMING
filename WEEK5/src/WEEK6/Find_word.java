package WEEK6;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find_word {
	
	public static void main(String[] args) {

		System.out.println("경영정보학과 60161051 김동현");
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\Kim\\Documents\\out.txt"); // File객체의 첫 생성자에 경로명을 입력.
		
		System.out.print("찾을 단어를 입력하세요. : ");
		String word = sc.next();
		
		int count=0;
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {//has next는 계속 읽어 들여올 텍스트가 있는가를 확인하는 메소드
				String stp = s.next();
				//System.out.println(s.next());//스페이스로 구분된 단어단위로 계속 출력 
				if(stp.equals(word)==true) {
					count++;
				}

			}
			System.out.print(word+"(이)가 나온 횟수: "+count);
			s.close();//파일 닫기
		}catch(FileNotFoundException err) {
			//파일이 없을 경우
			System.out.println("파일 존재여부를 확인하세요.");
		}

	}

}

package WEEK6;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) throws IOException{
		try {
			//바이트 단위로 파일 읽기
			FileInputStream fileStream = null; // 파일 스트림
			
			fileStream = new FileInputStream("C:/Users/Kim/Documents/out.txt"); //파일 스트림 생성
			//버퍼 선언
			byte[ ]readBuffer = new byte[fileStream.available()];
			while (fileStream.read( readBuffer ) != -1) {}
			System.out.println(new String(readBuffer));//출력
			
			fileStream.close();//스트림 닫기.
			}catch(IOException err) {
			err.getStackTrace();
			}
	}
}

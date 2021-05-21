package WEEK6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderException {

	public static void main(String[] args) {
		
		try {
			//파일 객체 생성
			File file = new File("C:\\Users\\Kim\\Documents\\out.txt");
			//입력 스트림 생성
			// file reader는 스페이스도 하나의 문자로 인식.
			// 문자 단위.
			FileReader file_reader = new FileReader(file);
			int cur=0;
			while((cur = file_reader.read()) != -1) {
				System.out.print((char)cur);
			}
			file_reader.close();
			}catch(FileNotFoundException err) {
				err.getStackTrace();
			}catch(IOException err) {
				err.getStackTrace();
			}

	}

}

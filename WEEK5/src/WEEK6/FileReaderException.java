package WEEK6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderException {

	public static void main(String[] args) {
		
		try {
			//���� ��ü ����
			File file = new File("C:\\Users\\Kim\\Documents\\out.txt");
			//�Է� ��Ʈ�� ����
			// file reader�� �����̽��� �ϳ��� ���ڷ� �ν�.
			// ���� ����.
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

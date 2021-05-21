package Week6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderException {

	public static void main(String[] args) {
		try {
			//���� ��ü ����
			File f = new File("C:\\Users\\Kim\\Documents\\out.txt");
			//��ĳ�� ��ü ����
			Scanner sc = new Scanner(f);
			//�Է� ��Ʈ�� ����
			FileReader file_reader = new FileReader(f);
			
			int cur = 0;
			while((cur = file_reader.read()) != -1) {
				System.out.print((char)cur);
			}
			file_reader.close();
		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}catch(IOException e) {
			e.getStackTrace();
		}

	}

}

package WEEK6;

import java.io.*; //input, output ����.
import java.util.Scanner;

public class FileO {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Kim\\Documents\\out.txt"); // File��ü�� ù �����ڿ� ��θ��� �Է�.
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {//has next�� ��� �о� �鿩�� �ؽ�Ʈ�� �ִ°��� Ȯ���ϴ� �޼ҵ�
				System.out.println(s.next());//�����̽��� ���е� �ܾ������ ��� ���
			}
			s.close();//���� �ݱ�
		}catch(FileNotFoundException err) {
			//������ ���� ���
			System.out.println("������ �����ϴ�.");
		}

	}

}

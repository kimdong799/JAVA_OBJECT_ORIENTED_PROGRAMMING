package WEEK6;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) throws IOException{
		try {
			//����Ʈ ������ ���� �б�
			FileInputStream fileStream = null; // ���� ��Ʈ��
			
			fileStream = new FileInputStream("C:/Users/Kim/Documents/out.txt"); //���� ��Ʈ�� ����
			//���� ����
			byte[ ]readBuffer = new byte[fileStream.available()];
			while (fileStream.read( readBuffer ) != -1) {}
			System.out.println(new String(readBuffer));//���
			
			fileStream.close();//��Ʈ�� �ݱ�.
			}catch(IOException err) {
			err.getStackTrace();
			}
	}
}

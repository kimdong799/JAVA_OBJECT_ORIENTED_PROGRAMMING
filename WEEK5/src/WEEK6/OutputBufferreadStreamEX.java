package WEEK6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputBufferreadStreamEX {
	
	public static void main(String[] args) throws IOException{
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:/Users/Kim/Documents/out.txt"));
			String str = "����־��! �ڹ�!"; // �����ؾ��� ������
			bs.write(str.getBytes());//Byte �����θ� ���� �� ����.
		}catch(IOException e) {
				e.getStackTrace();
				
		}finally {
			bs.close();
		}
		}
		
}

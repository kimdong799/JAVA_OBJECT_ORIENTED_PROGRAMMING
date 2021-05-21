package WEEK6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputBufferreadStreamEX {
	
	public static void main(String[] args) throws IOException{
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:/Users/Kim/Documents/out.txt"));
			String str = "재미있어요! 자바!"; // 저장해야할 데이터
			bs.write(str.getBytes());//Byte 형으로만 넣을 수 있음.
		}catch(IOException e) {
				e.getStackTrace();
				
		}finally {
			bs.close();
		}
		}
		
}

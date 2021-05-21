package Week6;
import java.io.*;
import java.util.Scanner;

public class FileException {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Kim\\Documents\\out.txt");
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				System.out.print(sc.next()+" ");
			}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.\n"+e.getMessage());
		}

	}

}

package Week6;
import java.io.*;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
			
		try {
			int count =0;
			
			File f = new File("C:\\Users\\Kim\\Documents\\out.txt");
			Scanner word = new Scanner(System.in);
			System.out.println("단어 입력:");
			String input = word.next();
			
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				String next = sc.next();
				if(next.equals(input)==true) {
					count++;
				}
			}
			System.out.println(count);
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

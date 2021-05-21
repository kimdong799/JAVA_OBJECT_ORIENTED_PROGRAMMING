package Week6;
import java.io.*;
import java.util.Scanner;


public class Count_Word {

	  public static void main(String[] args) {
	      
	      System.out.println("60171090 박연희");
	      File f = new File("C:\\Users\\Kim\\Desktop\\choco.txt");
	      
	      Scanner scn = new Scanner(System.in);
	      System.out.print("검색할 단어를 입력하세요: ");
	      String word = scn.next();
	      
	      int count =0;
	      
	      try {
	            Scanner s = new Scanner(f);
	            while(s.hasNext()) {
	               String text = s.next();
	               
	               if(text.equals(word)==true) {
	                  count++;
	               }
	            }
	            System.out.println("'"+word+"'(은)는 "+count+"번 나옵니다");
	            s.close();
	            
	            
	            
	      } catch (FileNotFoundException err) {
	         System.out.println("파일 존재여부를 확인하세요");
	      
	      }
	  }

	}
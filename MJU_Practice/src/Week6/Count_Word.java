package Week6;
import java.io.*;
import java.util.Scanner;


public class Count_Word {

	  public static void main(String[] args) {
	      
	      System.out.println("60171090 �ڿ���");
	      File f = new File("C:\\Users\\Kim\\Desktop\\choco.txt");
	      
	      Scanner scn = new Scanner(System.in);
	      System.out.print("�˻��� �ܾ �Է��ϼ���: ");
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
	            System.out.println("'"+word+"'(��)�� "+count+"�� ���ɴϴ�");
	            s.close();
	            
	            
	            
	      } catch (FileNotFoundException err) {
	         System.out.println("���� ���翩�θ� Ȯ���ϼ���");
	      
	      }
	  }

	}
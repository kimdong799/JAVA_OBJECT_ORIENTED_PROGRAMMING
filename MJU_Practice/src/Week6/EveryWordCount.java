package Week6;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EveryWordCount {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
	 
			String S = in.nextLine();
			in.close();
	 
			// st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
			StringTokenizer st = new StringTokenizer(S," ");
			
			// countTokens() �� ��ū�� ������ ��ȯ�Ѵ�
			System.out.println(st.countTokens());	
	}

}

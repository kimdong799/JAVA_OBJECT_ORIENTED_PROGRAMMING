package WEEK6;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find_word {
	
	public static void main(String[] args) {

		System.out.println("�濵�����а� 60161051 �赿��");
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\Kim\\Documents\\out.txt"); // File��ü�� ù �����ڿ� ��θ��� �Է�.
		
		System.out.print("ã�� �ܾ �Է��ϼ���. : ");
		String word = sc.next();
		
		int count=0;
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {//has next�� ��� �о� �鿩�� �ؽ�Ʈ�� �ִ°��� Ȯ���ϴ� �޼ҵ�
				String stp = s.next();
				//System.out.println(s.next());//�����̽��� ���е� �ܾ������ ��� ��� 
				if(stp.equals(word)==true) {
					count++;
				}

			}
			System.out.print(word+"(��)�� ���� Ƚ��: "+count);
			s.close();//���� �ݱ�
		}catch(FileNotFoundException err) {
			//������ ���� ���
			System.out.println("���� ���翩�θ� Ȯ���ϼ���.");
		}

	}

}

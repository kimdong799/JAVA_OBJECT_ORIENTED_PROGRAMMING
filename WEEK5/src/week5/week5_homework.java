package week5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Comparator;

public class week5_homework {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++){
			System.out.println("���ڸ� �Է��ϼ���.");
			int a = sc.nextInt();
			list.add(a);
			if (a==0)break;
		}
		for(int i=0; i<list.size(); i++)
		{
			System.out.printf(" %d", list.get(i));
		}
		
		int max=0;
		for(int i=0; i<list.size(); i++) 
		{
			if (max<list.get(i))max=list.get(i);
			else max=max;
		}
		System.out.println();
		System.out.println("�ִ밪 :"+max);
		
		int min=0;
		for(int i=0; i<list.size(); i++) 
		{
			if (min>list.get(i))min=list.get(i);
			else min=min;
		}
		System.out.println();
		System.out.println("�ּҰ� :"+min);
		
		// �������� ����
		Collections.sort(list);
		System.out.println("�������� ����:"+list);
		
		// �������� ����
		Collections.reverse(list);
		System.out.println("�������� ����:"+list);

	
	}
}

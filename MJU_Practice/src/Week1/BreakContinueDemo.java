package Week1;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==4)break; // �ݺ��� �ߴ�.
			System.out.print(i);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==4) continue; // �������� �� �ݺ� �簳
			System.out.print(i);	
		}
		System.out.println();
		
		//Q.1���� 10������ ���� �μ��ϴٰ� 3�� ����� �Ǹ� �ǳʶٽÿ�.
		for(int i=0; i<10; i++) {
			if(i%3==0)continue;
			System.out.print(i);
		}

	}

}

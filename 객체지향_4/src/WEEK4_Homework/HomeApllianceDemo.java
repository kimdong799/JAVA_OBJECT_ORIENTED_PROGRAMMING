package WEEK4_Homework;

public class HomeApllianceDemo {

	public static void main(String[] args) {
		
		TV t = new TV();
		Microwave m = new Microwave();
		
		t.charging(2000);
		t.operate();
		System.out.println("���� ä���� "+ t.chanel+"�� �Դϴ�.");
		t.reserve_operate(1);
		
		System.out.println("-------------------------------------");
		
		m.charging(100);
		m.operate();
		System.out.println("�� ���ڷ������� ���Դ� "+ m.weight+"KG �Դϴ�.");
		m.reserve_operate(2);
	}

}

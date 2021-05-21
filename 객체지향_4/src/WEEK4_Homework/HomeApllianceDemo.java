package WEEK4_Homework;

public class HomeApllianceDemo {

	public static void main(String[] args) {
		
		TV t = new TV();
		Microwave m = new Microwave();
		
		t.charging(2000);
		t.operate();
		System.out.println("현재 채널은 "+ t.chanel+"번 입니다.");
		t.reserve_operate(1);
		
		System.out.println("-------------------------------------");
		
		m.charging(100);
		m.operate();
		System.out.println("이 전자레인지의 무게는 "+ m.weight+"KG 입니다.");
		m.reserve_operate(2);
	}

}

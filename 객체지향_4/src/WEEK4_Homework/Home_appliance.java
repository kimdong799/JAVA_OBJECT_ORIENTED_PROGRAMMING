package WEEK4_Homework;

public abstract class Home_appliance {
	
	double battery; // �������
	
	public Home_appliance() { // ��ü���� �� ������� �ʱ�ȭ
		battery = 5;
	}
	
	public void charging(int time) {  // �Ϲݸ޼ҵ�
		System.out.println("���� ���� : "+battery+"%");
		this.battery += time*0.1;
		System.out.println(time+" �� ���� �����Ͽ����ϴ�.");
		if (this.battery > 100) 
		{
			this.battery = 100;
		System.out.println("���� ������ : "+battery+"%");
		}
		else System.out.println("���� ������ : "+battery+"%");
	}
	
	public abstract void operate(); // �߻�޼ҵ�
	
	public abstract void reserve_operate(int x); // �߻�޼ҵ�

}

package Practice;


public class Refreigerator2 {
	
	int temp;
	boolean isOn;
	
	// temp, isOn�� ���ڰ��� ������ ������
	public Refreigerator2(int temp, boolean isOn) {
		this.temp = temp;
		this.isOn = isOn;
	}
	
	public void switchOn(){
		if(isOn == false)System.out.println("���� �÷��׸� ������ �� �ִ�.");
		else System.out.println("�̹� ������ �����ֽ��ϴ�.");
	}
	
	public void switchOff() {
		if(isOn == true)System.out.println("���� �÷��׸� ���� �� �ִ�.");
		else System.out.println("�̹� ������ �����ֽ��ϴ�.");
	}
	public void raiseTemp(int tempForRaise) {
		this.temp += tempForRaise;
		System.out.println("�µ��� ����մϴ�. ����µ�:"+this.temp);
	}
	public void lowerTemp(int tempForLow) {
		this.temp -= tempForLow;
		System.out.println("�µ��� �϶��մϴ�. ����µ�:"+this.temp);
	}

	public static void main(String[] args) {
		Refreigerator2 R1 = new Refreigerator2(0,true);
		Refreigerator2 R2 = new Refreigerator2(0,false);
		
		R1.switchOn();
		R1.switchOff();
		R1.raiseTemp(5);
		R1.lowerTemp(5);
		
	}

}

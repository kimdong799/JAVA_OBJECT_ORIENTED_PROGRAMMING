package Practice;

public class Refreigerator {

	// ����� Ŭ������ �����Ͻÿ�.
	
	int temp;//���οµ�.
	boolean isOn;
	
	public Refreigerator(int temp, boolean isOn) {
		this.temp = temp;
		this.isOn = isOn;
	}
	
	public void swichOn() {
		if(isOn==false) {
			System.out.println("���� �÷��׸� ������ �� �ִ�.");
			this.isOn = true;
		}
	}
	public void swichOff() {
		if(isOn==true) {
			System.out.println("���� �÷α׸� ���� �� �ִ�.");
		}
	}
	public void raiseTemp(int temp) {
		if(isOn==true) {
			System.out.println("������ �����־� �µ��� ���� �� �ֽ��ϴ�.");
			if((this.temp+temp>=10)) {
				System.out.println("10�� �̻����� ������ �� �����ϴ�.");
			}
			else {
				System.out.println("�µ��� "+this.temp+"�� ����"+ (this.temp+temp)+"���� �Ǿ����ϴ�.");
				this.temp+=temp;
			}
		}
		else {
			System.out.println("������ �����־� �µ��� ���� �� �����ϴ�.");
		}
	}
	public void lowerTemp(int temp) {
		if(isOn==true) {
			System.out.println("������ �����־� �µ��� ���� �� �ֽ��ϴ�.");
			if((this.temp-temp)<=-20) {
				System.out.println("-20�� ���Ϸ� ������ �� �����ϴ�.");
				}
			else {
				System.out.println("�µ��� "+this.temp+"�� ����"+ (this.temp-temp)+"���� �Ǿ����ϴ�.");
				this.temp-=temp;
			}
		}
		else{
			System.out.println("������ �����־� �µ��� ���� �� �����ϴ�.");	
		}
	}
	
	
	public static void main(String[] args) {
		Refreigerator R = new Refreigerator(0,false);
		
		R.swichOn();
		R.swichOff();
		R.raiseTemp(9);
		R.lowerTemp(25);

	}

}

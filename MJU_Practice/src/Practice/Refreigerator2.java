package Practice;


public class Refreigerator2 {
	
	int temp;
	boolean isOn;
	
	// temp, isOn의 인자값을 가지는 생성자
	public Refreigerator2(int temp, boolean isOn) {
		this.temp = temp;
		this.isOn = isOn;
	}
	
	public void switchOn(){
		if(isOn == false)System.out.println("전원 플러그를 연결할 수 있다.");
		else System.out.println("이미 전원이 켜져있습니다.");
	}
	
	public void switchOff() {
		if(isOn == true)System.out.println("전원 플러그를 뽑을 수 있다.");
		else System.out.println("이미 전원이 꺼져있습니다.");
	}
	public void raiseTemp(int tempForRaise) {
		this.temp += tempForRaise;
		System.out.println("온도가 상승합니다. 현재온도:"+this.temp);
	}
	public void lowerTemp(int tempForLow) {
		this.temp -= tempForLow;
		System.out.println("온도가 하락합니다. 현재온도:"+this.temp);
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

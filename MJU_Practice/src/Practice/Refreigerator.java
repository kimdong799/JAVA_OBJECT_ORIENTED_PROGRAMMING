package Practice;

public class Refreigerator {

	// 냉장고 클래스를 구현하시오.
	
	int temp;//내부온도.
	boolean isOn;
	
	public Refreigerator(int temp, boolean isOn) {
		this.temp = temp;
		this.isOn = isOn;
	}
	
	public void swichOn() {
		if(isOn==false) {
			System.out.println("전원 플러그를 연결할 수 있다.");
			this.isOn = true;
		}
	}
	public void swichOff() {
		if(isOn==true) {
			System.out.println("전원 플로그를 뽑을 수 있다.");
		}
	}
	public void raiseTemp(int temp) {
		if(isOn==true) {
			System.out.println("전원이 켜져있어 온도를 높일 수 있습니다.");
			if((this.temp+temp>=10)) {
				System.out.println("10도 이상으로 설정할 수 없습니다.");
			}
			else {
				System.out.println("온도가 "+this.temp+"도 에서"+ (this.temp+temp)+"도가 되었습니다.");
				this.temp+=temp;
			}
		}
		else {
			System.out.println("전원이 꺼져있어 온도를 높일 수 없습니다.");
		}
	}
	public void lowerTemp(int temp) {
		if(isOn==true) {
			System.out.println("전원이 켜져있어 온도를 낮출 수 있습니다.");
			if((this.temp-temp)<=-20) {
				System.out.println("-20도 이하로 설정할 수 없습니다.");
				}
			else {
				System.out.println("온도가 "+this.temp+"도 에서"+ (this.temp-temp)+"도가 되었습니다.");
				this.temp-=temp;
			}
		}
		else{
			System.out.println("전원이 꺼져있어 온도를 낮출 수 없습니다.");	
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

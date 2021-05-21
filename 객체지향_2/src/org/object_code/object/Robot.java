package org.object_code.object;

import java.util.Scanner;

public class Robot {
	
	char c;
	boolean recognition_completed;
	boolean motion_detected;
	int charge_amount;
	String cartoon;

	void detecting()
	{
		if(c=='Z')System.out.println("경비모드가 해제되었습니다. 환영합니다 :)");
		else System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
	}
	
	void recognizing()
{
	if(this.recognition_completed == false)System.out.println("경비모드 작동중입니다.");
	else System.out.println("주인님 환영합니다.");
}
	
	void chargeup(int v)
	{
		this.charge_amount+=v;
		System.out.println("현재 충전량: "+this.charge_amount);
		if(this.charge_amount >= 100)System.out.println("충전량 100퍼센트입니다.");
		else if(this.charge_amount >= 50)System.out.println("충전량 50퍼센트입니다.");
		else System.out.println("충전이 필요합니다!!");
		while(this.charge_amount <= 50)
		{
			charge_amount ++;
			System.out.println("최소 전력인 50%까지 충전중입니다.." + charge_amount+'%');
		}
	}
	void cartoon_select()
	{
		System.out.println(cartoon+"에 대한 검색 결과입니다. 재미있게 감상하세요 :)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		Scanner scn = new Scanner(System.in);

		System.out.println("60161051 경영정보학과 김동현");
		System.out.println("-----육아로봇이 작동됩니다.-----");
		
		System.out.println("경비모드 작동중입니다. 경비모드를 해제하시려면 비밀번호를 입력하세요.");
		System.out.println("비밀번호를 입력하세요");
		
		r.c  = scn.next().charAt(0);
		r.motion_detected = false;
		r.detecting();
		r.recognition_completed = true;
		r.recognizing();
		r.chargeup(47);
		System.out.println("원하시는 유아용 만화를 입력하세요");
		r.cartoon = scn.next();
		r.cartoon_select();

	}

}

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
		if(c=='Z')System.out.println("����尡 �����Ǿ����ϴ�. ȯ���մϴ� :)");
		else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���");
	}
	
	void recognizing()
{
	if(this.recognition_completed == false)System.out.println("����� �۵����Դϴ�.");
	else System.out.println("���δ� ȯ���մϴ�.");
}
	
	void chargeup(int v)
	{
		this.charge_amount+=v;
		System.out.println("���� ������: "+this.charge_amount);
		if(this.charge_amount >= 100)System.out.println("������ 100�ۼ�Ʈ�Դϴ�.");
		else if(this.charge_amount >= 50)System.out.println("������ 50�ۼ�Ʈ�Դϴ�.");
		else System.out.println("������ �ʿ��մϴ�!!");
		while(this.charge_amount <= 50)
		{
			charge_amount ++;
			System.out.println("�ּ� ������ 50%���� �������Դϴ�.." + charge_amount+'%');
		}
	}
	void cartoon_select()
	{
		System.out.println(cartoon+"�� ���� �˻� ����Դϴ�. ����ְ� �����ϼ��� :)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		Scanner scn = new Scanner(System.in);

		System.out.println("60161051 �濵�����а� �赿��");
		System.out.println("-----���Ʒκ��� �۵��˴ϴ�.-----");
		
		System.out.println("����� �۵����Դϴ�. ����带 �����Ͻ÷��� ��й�ȣ�� �Է��ϼ���.");
		System.out.println("��й�ȣ�� �Է��ϼ���");
		
		r.c  = scn.next().charAt(0);
		r.motion_detected = false;
		r.detecting();
		r.recognition_completed = true;
		r.recognizing();
		r.chargeup(47);
		System.out.println("���Ͻô� ���ƿ� ��ȭ�� �Է��ϼ���");
		r.cartoon = scn.next();
		r.cartoon_select();

	}

}

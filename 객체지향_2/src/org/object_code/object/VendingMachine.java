package org.object_code.object;

public class VendingMachine {

	int cash;
	int stock;
	int sales;
	
	
	
	void stockup(int s)
	{
		this.stock += s;
		if(this.stock ==0) System.out.println("��� ����. ��� ä���ּ���.");
		else System.out.println("���� ���� ���� "+s+"�� �Դϴ�.");
	
	}
	
	
	void insertCoin(int c)
	{
		this.cash+=c;
		
		
		while(this.cash >=800)
		{ 
			System.out.println("��������");
			this.cash-=800;
			this.sales++;
		}
			System.out.println("���� �Ǹŷ�: "+this.sales);
			int current_stock = this.stock-this.sales;
			System.out.println("���� ���: "+current_stock);
			if (current_stock == 0) System.out.println("������. ��� ä���ּ���");
	}	
	void givechange()
	{
		if(this.cash < 800) System.out.println("�ܵ�"+cash+"���� ��ȯ�˴ϴ�.");
		this.cash = 0;
		System.out.println("���� ��� ���� �ݾ�:"+ cash);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine v = new VendingMachine();
		
		System.out.println("60161051 �濵�����а� �赿��");
		v.cash = 0;
		v.stockup(0);
		v.stockup(1);
		v.insertCoin(1000);
		v.givechange();
	}

}

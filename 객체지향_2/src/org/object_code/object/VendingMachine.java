package org.object_code.object;

public class VendingMachine {

	int cash;
	int stock;
	int sales;
	
	
	
	void stockup(int s)
	{
		this.stock += s;
		if(this.stock ==0) System.out.println("재고 없음. 재고를 채워주세요.");
		else System.out.println("현재 생수 재고는 "+s+"병 입니다.");
	
	}
	
	
	void insertCoin(int c)
	{
		this.cash+=c;
		
		
		while(this.cash >=800)
		{ 
			System.out.println("생수나옴");
			this.cash-=800;
			this.sales++;
		}
			System.out.println("생수 판매량: "+this.sales);
			int current_stock = this.stock-this.sales;
			System.out.println("남은 재고량: "+current_stock);
			if (current_stock == 0) System.out.println("재고없음. 재고를 채워주세요");
	}	
	void givechange()
	{
		if(this.cash < 800) System.out.println("잔돈"+cash+"원이 반환됩니다.");
		this.cash = 0;
		System.out.println("현재 사용 가능 금액:"+ cash);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine v = new VendingMachine();
		
		System.out.println("60161051 경영정보학과 김동현");
		v.cash = 0;
		v.stockup(0);
		v.stockup(1);
		v.insertCoin(1000);
		v.givechange();
	}

}

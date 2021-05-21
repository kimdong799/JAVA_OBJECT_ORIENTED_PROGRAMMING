package Week2;

public class VendingMachine {

	//멤버변수
	int coin;
	int stock = 0;
	int sales;
	int SaledProduct;
	
	public void filling_stock(int Fstock) {
		System.out.println("입고량 :"+Fstock);
		stock = stock+Fstock;
		System.out.println("남은 재고량: "+stock);
	}
	
	public void insert_coin(int coin) {
		this.coin=coin;
		System.out.println("투입금액: "+coin);
	}
	public void sales_product() {
		if(coin>800) {
			SaledProduct = coin/800;
			System.out.println("상품 판매량 :"+SaledProduct);
			
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	public void present_stock() {
		stock = stock-(coin/800);
		System.out.println("현재 재고량 :"+stock);
	}
	public void give_change() {
		coin = coin-(SaledProduct*800);
		System.out.println("반환 금액 :"+coin);
	}
	
	
	public static void main(String[] args) {
		
		VendingMachine v = new VendingMachine();
		
		v.filling_stock(10);
		v.insert_coin(6200);
		v.sales_product();
		v.present_stock();
		v.give_change();

	}

}

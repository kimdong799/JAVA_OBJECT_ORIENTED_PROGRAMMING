package Practice;

public class VendingMachine {
	
	int coin;
	int bottle = 800;
	int sales=0;
	int stock;
	
	public void stockUp(int stock) {
		this.stock += stock;
		System.out.println("현재 재고 :"+this.stock);
	}
	public void insertCoin(int coin) {
		this.coin = coin;
		System.out.println("투입금액 :"+this.coin);
	
		while(this.stock>0) {
			if(this.coin>=800) {
				this.sales++;
				this.stock--;
				this.coin-=this.bottle;
			}
			else if(this.coin<800) {
				break;
			}
			
		}
		if(this.stock==0)System.out.println("재고가 없습니다.");
		System.out.println(this.sales+"개 나왔습니다.");
		System.out.println("남은 재고량 :"+this.stock);
	}
	
	public void giveChange() {
		if(this.coin>0) {
			System.out.println(this.coin+" 원의 잔돈을 반환합니다.");
			this.coin=0;
		}
		else System.out.println("반환할 잔돈이 없습니다.");
		
	}

	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		
		v.stockUp(10);
		v.insertCoin(5000);
		v.giveChange();
	}

}

package Practice;

public class VendingMachine2 {
	
	int coin;
	int sales=0;
	int stock=0;;
	int change;
	int bottle = 800;

	public void stockUp(int stock) {
		this.stock+=stock;
		System.out.println("재고량 :"+this.stock);
	}
	public void insertCoin(int coin) {
		this.coin = coin;
		System.out.println("투입금액 :"+this.coin);
	}
	public void saleBottles() {
		while(this.stock>0) {
			if(this.coin>=this.bottle) {
				this.sales++;
				this.stock--;
				this.coin-=this.bottle;
				System.out.println("띠링~!");
			}
			else if(this.coin<800) {
				System.out.println("투입금액이 부족합니다.");
				break;
			}
		}
		System.out.println("판매량 :"+this.sales);
		System.out.println("재고량 :"+this.stock);
	}
	public void exchange() {
		System.out.println("-----잔돈을 반환합니다.-----");
		while(this.coin > 0) {
			if(this.coin>0) {
				if(this.coin >=1000) {
					System.out.println("천원지폐 :"+this.coin/1000);
					this.coin -= (this.coin/1000)*1000;
				}
				else if(this.coin >=500) {
					System.out.println("오백원동전 :"+this.coin/500);
					this.coin -= (this.coin/500)*500;
				}
				else if(this.coin >=100) {
					System.out.println("백원동전 :"+this.coin/100);
					this.coin -= (this.coin/100)*100;
				}
				else if(this.coin >=50) {
					System.out.println("오십원동전 :"+this.coin/50);
					this.coin -= (this.coin/50)*50;
				}
				else if (this.coin >=10) {
					System.out.println("십원동전 :"+this.coin/10);
					this.coin -= (this.coin/10)*10;
				}	
		}	
	}
	}
	
	public static void main(String[] args) {
		VendingMachine2 v = new VendingMachine2();
		
		v.stockUp(5);
		v.insertCoin(790);
		v.saleBottles();
		v.exchange();
	}

}

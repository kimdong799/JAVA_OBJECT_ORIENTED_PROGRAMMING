package Practice;

public class VendingMachine2 {
	
	int coin;
	int sales=0;
	int stock=0;;
	int change;
	int bottle = 800;

	public void stockUp(int stock) {
		this.stock+=stock;
		System.out.println("��� :"+this.stock);
	}
	public void insertCoin(int coin) {
		this.coin = coin;
		System.out.println("���Աݾ� :"+this.coin);
	}
	public void saleBottles() {
		while(this.stock>0) {
			if(this.coin>=this.bottle) {
				this.sales++;
				this.stock--;
				this.coin-=this.bottle;
				System.out.println("�층~!");
			}
			else if(this.coin<800) {
				System.out.println("���Աݾ��� �����մϴ�.");
				break;
			}
		}
		System.out.println("�Ǹŷ� :"+this.sales);
		System.out.println("��� :"+this.stock);
	}
	public void exchange() {
		System.out.println("-----�ܵ��� ��ȯ�մϴ�.-----");
		while(this.coin > 0) {
			if(this.coin>0) {
				if(this.coin >=1000) {
					System.out.println("õ������ :"+this.coin/1000);
					this.coin -= (this.coin/1000)*1000;
				}
				else if(this.coin >=500) {
					System.out.println("��������� :"+this.coin/500);
					this.coin -= (this.coin/500)*500;
				}
				else if(this.coin >=100) {
					System.out.println("������� :"+this.coin/100);
					this.coin -= (this.coin/100)*100;
				}
				else if(this.coin >=50) {
					System.out.println("���ʿ����� :"+this.coin/50);
					this.coin -= (this.coin/50)*50;
				}
				else if (this.coin >=10) {
					System.out.println("�ʿ����� :"+this.coin/10);
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

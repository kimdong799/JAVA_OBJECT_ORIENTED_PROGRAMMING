package Practice;

public class VendingMachine {
	
	int coin;
	int bottle = 800;
	int sales=0;
	int stock;
	
	public void stockUp(int stock) {
		this.stock += stock;
		System.out.println("���� ��� :"+this.stock);
	}
	public void insertCoin(int coin) {
		this.coin = coin;
		System.out.println("���Աݾ� :"+this.coin);
	
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
		if(this.stock==0)System.out.println("��� �����ϴ�.");
		System.out.println(this.sales+"�� ���Խ��ϴ�.");
		System.out.println("���� ��� :"+this.stock);
	}
	
	public void giveChange() {
		if(this.coin>0) {
			System.out.println(this.coin+" ���� �ܵ��� ��ȯ�մϴ�.");
			this.coin=0;
		}
		else System.out.println("��ȯ�� �ܵ��� �����ϴ�.");
		
	}

	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		
		v.stockUp(10);
		v.insertCoin(5000);
		v.giveChange();
	}

}

package Week2;

public class VendingMachine {

	//�������
	int coin;
	int stock = 0;
	int sales;
	int SaledProduct;
	
	public void filling_stock(int Fstock) {
		System.out.println("�԰� :"+Fstock);
		stock = stock+Fstock;
		System.out.println("���� ���: "+stock);
	}
	
	public void insert_coin(int coin) {
		this.coin=coin;
		System.out.println("���Աݾ�: "+coin);
	}
	public void sales_product() {
		if(coin>800) {
			SaledProduct = coin/800;
			System.out.println("��ǰ �Ǹŷ� :"+SaledProduct);
			
		}
		else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	public void present_stock() {
		stock = stock-(coin/800);
		System.out.println("���� ��� :"+stock);
	}
	public void give_change() {
		coin = coin-(SaledProduct*800);
		System.out.println("��ȯ �ݾ� :"+coin);
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

package ���߻��;

public class PhoneClass {

	private String phone_number = "01021015291";
	// ��������� ��� �������� ���Ƿ� �ٲ�� ���� ���� ����, ��ġ�ʴ� �ڷ��� �����̳� ���� ������ ��������
	// private���� ������ �ش� Ŭ���� ���ο����� ��������� ������ �� �ֵ��� ��.
	// �ܺο��� �����Ϸ��� �޼ҵ带 ���������� ���� ����, ��������� �ڵ鸵�ϴ� ������ �ٸ� �޼ҵ带 ���� ���� ����.
	
	// ���� �޼ҵ�� �ܺο����� ��� �����ϵ��� public���� ����
	public void show_phone_number() {
		System.out.println(phone_number);
	}
	
	public void call(String call_number) {
		System.out.println("��ȭ�� �ɷȽ��ϴ�.");
	}
	
	public void hang_up() {
		System.out.println("��ȭ�� ����Ǿ����ϴ�.");
		
	}
	
	public static void main(String[] args) {
		
		PhoneClass p = new PhoneClass();
		p.show_phone_number();
		p.call("01073726912");
		p.hang_up();
	}

}

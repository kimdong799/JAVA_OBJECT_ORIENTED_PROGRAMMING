
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������
		char var1 = '��'; //�ѱ��ڸ� ���� ���� ����(2byte)
		String var2 = "�赿��"; // ���ڿ� ���� ����
		
		//������
		byte var3 = 24; //-128~+127������ �Է� ����
		short var4 = -1251; //2byte -32768 ~ +32767
		int var5 = 999999999; //+-21�� ����
		long var6 = 99999999; //8byte 
		
		//�Ǽ���
		float var7 = 0.5f; //float ������ f�� �߰� �Է�
		double var8 = 0.3333333; //float=4byte, double= 8byte
		
		//boolean 
		boolean isStart = false; // true or false �� �Է��Ͽ� ���ǽĿ��� ���� ���
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(isStart);
	}

}

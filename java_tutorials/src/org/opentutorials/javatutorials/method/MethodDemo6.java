package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output ="";
		
		while(i<limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� ������ ���� ���� result�� ����.
		String result = numbering(1,5);
		//����  result�� ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);

	}

}

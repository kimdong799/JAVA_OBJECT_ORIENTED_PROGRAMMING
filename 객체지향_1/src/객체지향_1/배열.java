package ��ü����_1;

public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭������//
		//������Ÿ��[] �迭�� = new ������Ÿ��[�迭ũ��]
		
		//���� 4���� ������ �� �ִ� �迭����
		int[] array1 = new int[4];
		
		//�迭�� ���� �����ϴ� ���
		int[] array2 = {1,2,3,4};
		
		//2���� �迭 ����
		//������Ÿ��[][]�迭�� = new ������Ÿ��[��ũ��][��ũ��]
		int[][]array3 = new int[3][4];
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<4; ++j) {
				array3[i][j] = (i*10)+j;
			}
		}
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<4; ++j) {
				System.out.print(array3[i][j]+" ");
			}	
			System.out.println();
		}
		
	}

}

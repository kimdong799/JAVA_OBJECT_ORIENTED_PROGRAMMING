package Week1;

public class Array {

	public static void main(String[] args) {
		//�迭�� �����ϴ� ���.
		String [] arr = {"ö��","����","¯��","����","�ͱ�"};
		//�迭 ���� ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//2���� �迭
		int[][]mat = {{1},{2,3},{4,5,6}};
		System.out.println(mat[0][0]);
		System.out.println(mat[1][0]);
		System.out.println(mat[1][1]);
		System.out.println(mat[2][0]);
		System.out.println(mat[2][1]);
		System.out.println();
		
		int[][]arr2 = new int[3][4]; // 3�� 4���� ���� 2���� �迭 ����.
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr2[i][j]=(i*10)+j;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//1���� ����
		int[][]arr3 = new int[10][10];
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				arr3[i][j]=(i*j);
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}

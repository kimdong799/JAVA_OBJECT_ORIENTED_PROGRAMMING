package Practice;

public class matrix {

	public static void main(String[] args) {
		
		// 2�� �迭�� �������� �����ϰ� ����Ͻÿ�. 2�� for���� �̿��� �����ϴ� �κа� ����ϴ� �κ��� ���� ��.
		
		int[][]mat = new int[9][9]; // 2���� �迭 ����
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				mat[i][j]=(i+1)*(j+1);
				System.out.printf("%3d",mat[i][j]);
			}
			System.out.println();
		}
		
	}

}

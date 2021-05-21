package Practice;

public class matrix {

	public static void main(String[] args) {
		
		// 2중 배열에 구구단을 저장하고 출력하시오. 2중 for문을 이용해 저장하는 부분과 출력하는 부분을 나눌 것.
		
		int[][]mat = new int[9][9]; // 2차원 배열 생성
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				mat[i][j]=(i+1)*(j+1);
				System.out.printf("%3d",mat[i][j]);
			}
			System.out.println();
		}
		
	}

}

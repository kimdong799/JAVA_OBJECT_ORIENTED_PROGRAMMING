package Practice;

public class arrayDemo {

	public static void demo1() {
		int[][]arr = new int[3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = (i*10)+j;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void demo2() {
		int[][]mat = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				mat[i][j] = (i+1)*(j+1);
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		demo1();
		demo2();
	}

}

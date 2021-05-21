package 备备窜苞力;

public class 备备窜苞力 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]array = new int[10][10];
		
		for(int i=1; i<10; ++i) {
			for(int j=1; j<10; ++j) {
				array[i][j] = i*j;
			}
		}
		
		for(int i=1; i<10; ++i) {
			for(int j=1; j<10; ++j) {
				System.out.print(array[i][j]+" ");
			}	
			System.out.println();
		}
	}

}
package Practice;

public class week2 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		String[]ZZangu = {"Â¯±¸","Ã¶¼ö","¼öÁö","¸Í±¸","ÈÆÀÌ"};
		for(int i=0; i<ZZangu.length;i++) {
			System.out.print(ZZangu[i]+" ");
		}
		
		System.out.println();
		
		int[][]mat = new int [3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				mat[i][j]=i*10+j;

				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}

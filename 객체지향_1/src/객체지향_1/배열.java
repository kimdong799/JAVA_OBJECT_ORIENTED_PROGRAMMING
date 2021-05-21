package 객체지향_1;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언방법//
		//데이터타입[] 배열명 = new 데이터타입[배열크기]
		
		//정수 4개를 저장할 수 있는 배열생성
		int[] array1 = new int[4];
		
		//배열에 값을 저장하는 방법
		int[] array2 = {1,2,3,4};
		
		//2차원 배열 생성
		//데이터타입[][]배열명 = new 데이터타입[행크기][열크기]
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

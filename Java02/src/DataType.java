
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자형
		char var1 = '김'; //한글자만 변수 선언 가능(2byte)
		String var2 = "김동현"; // 문자열 변수 가능
		
		//정수형
		byte var3 = 24; //-128~+127까지만 입력 가능
		short var4 = -1251; //2byte -32768 ~ +32767
		int var5 = 999999999; //+-21억 지원
		long var6 = 99999999; //8byte 
		
		//실수형
		float var7 = 0.5f; //float 변수는 f를 추가 입력
		double var8 = 0.3333333; //float=4byte, double= 8byte
		
		//boolean 
		boolean isStart = false; // true or false 를 입력하여 조건식에서 많이 사용
		
		
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

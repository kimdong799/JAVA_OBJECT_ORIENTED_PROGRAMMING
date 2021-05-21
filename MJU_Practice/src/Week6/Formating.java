package Week6;

public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("%s은 너무 번거롭습니다.", "이 방법"));
		System.out.printf("따라서 %s %s 방법을 선호합니다.\n","포매팅","방법 중 이");
		//%s 는 문자열, %d는 정수형
		System.out.printf("%d + %d 은 %d 입니다.\n",10, 20, 30);
		
		System.out.printf("%5d, %-8s, %10.3f\n",10,"안녕",3.5);
		
		// 자리수 지정 안함. 왼쪽 정렬됨.
		System.out.printf("자리수 미지정:%d\n",1);
		System.out.printf("자리수 미지정:%d\n",10);
		System.out.printf("자리수 미지정:%d\n",100);
		System.out.printf("자리수 미지정:%d\n",1000);
	
		//자리수 지정하면 오른쪽 정렬
		System.out.printf("자리수 지정:%5d\n",1);
		System.out.printf("자리수 지정:%5d\n",10);
		System.out.printf("자리수 지정:%5d\n",100);
		System.out.printf("자리수 지정:%5d\n",1000);
		
		//자리수 지정 후 '-' 사용하면 왼쪽 정렬
		System.out.printf("자리수 지정(-)사용:%-5d\n", 1);
		System.out.printf("자리수 지정(-)사용:%-5d\n", 10);
		System.out.printf("자리수 지정(-)사용:%-5d\n", 100);
		System.out.printf("자리수 지정(-)사용:%-5d\n", 1000);
		
		//자리수 지정 후 '0' 사용하면 오른쪽 정렬
		System.out.printf("자리수 지정(0)사용:%05d\n",1);
		System.out.printf("자리수 지정(0)사용:%05d\n",10);
		System.out.printf("자리수 지정(0)사용:%05d\n",100);
		System.out.printf("자리수 지정(0)사용:%05d\n",1000);
		
		
	}

}

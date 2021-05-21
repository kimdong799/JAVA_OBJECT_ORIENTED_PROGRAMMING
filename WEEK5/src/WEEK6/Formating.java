package WEEK6;

public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("%d + %d 은 %d 입니다.",10, 20, 30));
		System.out.printf("%d + %d = %d입니다.", 10,20,30);
		System.out.println();
		System.out.printf("%5d, %-8s, %10f", 10,"안녕", 3.5);
		//플래그 '-' 왼쪽 정렬, 생략시 오른쪽 정렬
		//
		System.out.println();
		System.out.printf("%5s", "권"); //한글은 두자리 잡아먹음
		System.out.println();
		System.out.printf("%-5s", "a");
		
		System.out.println();
		
		//예쁘게 출력 X
		System.out.printf("%s %s %s\n", "Name", "Total", "Avg");
		System.out.printf("%s %d %f\n", "Jones",950,80.2436);
		System.out.printf("%s %d %f\n", "Toms", 1050, 90.43);
		
		System.out.println();
		// 정렬해서 출력  %8.2 는 전체 8자리 중 소수점 2자리 허락한다는 뜻
		System.out.printf("%-8s %8s %8.2s\n", "Name", "Total", "Avg");
		System.out.printf("%-8s %8d %8.2f\n", "Jones",950,80.2436);
		System.out.printf("%-8s %8d %8.2f\n", "Toms", 1050, 90.43);
		// 출력될 문자 수 보다 포맷팅 수가 적으면 잘리는게 아니라 그냥 전체 출력됨.
		
		//자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
		System.out.printf("자리수 미지정: %d%n",1);
		System.out.printf("자리수 미지정: %d%n",10);
		System.out.printf("자리수 미지정: %d%n",100);
		System.out.printf("자리수 미지정: %d%n",1000);
		
		//자리수 지정했을 경우 오른쪽으로 정렬(남는 자리는 공백)
		System.out.printf("자리수 지정: %4d%n",1);
		System.out.printf("자리수 지정: %4d%n",10);
		System.out.printf("자리수 지정: %4d%n",100);
		System.out.printf("자리수 지정: %4d%n",1000);
		
		//자리수 지정 후 '-'를 사용하면 왼쪽으로 정렬된다.
		System.out.printf("자리수 지정('-'사용) :%-4d%n", 1);
		System.out.printf("자리수 지정('-'사용) :%-4d%n", 10);
		System.out.printf("자리수 지정('-'사용) :%-4d%n", 100);
		System.out.printf("자리수 지정('-'사용) :%-4d%n", 1000);
		
		//자리수 지정 후 '0' 사용하면 오른쪽으로 정렬된다. (왼쪽 자리수는 0으로 채운다.)
		System.out.printf("자리수 지정('0'사용) :%04d%n", 1);
		System.out.printf("자리수 지정('0'사용) :%04d%n", 10);
		System.out.printf("자리수 지정('0'사용) :%04d%n", 100);
		System.out.printf("자리수 지정('0'사용) :%04d%n", 1000);
	}

}

package 다중상속;

public class Son extends FatherA//, FatherB{
	{
	//Override
	void myMethod() {
		super.myMethod(); // A, B 누구를 출력??
	}

}
// 결론부터 말하자면 다중상속은 불가능.
// A, B의 메소드가 동일 이름과 반환값 모두 동일한 메소드이기 때문에 어떤 메소드를 상속받을지 충돌 발생.
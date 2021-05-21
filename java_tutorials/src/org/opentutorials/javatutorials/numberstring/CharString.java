package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(String[] args) {
		System.out.println('생'); // 문자
		System.out.println("생활코딩"); //문자열

	//에러발생	System.out.println('생활코딩');
	//문자열은 ""로 묶어줘야함.
		System.out.println("생");
		// 하지만 문자는 ""가능, 한 글자도 문자열이 될 수 있기 때문
		
		//+를 연산자라고 하는데 문자도 연산이 가능
		System.out.println("생활코딩"+"입니다.");
		
		//따옴표로 묶인 1은 문자열(String)로 인식됨.
		System.out.println("1"+1);
		
		//ESCAPE
		
		//문자열 안에 큰 따옴표를 넣고 싶다면??
		//문자로 인식시킬 따옴표 앞에 역슬래시를 사용!
		System.out.println("Kim said \"Welcome programming world\"");
		
		//여러 줄을 표시하고 싶다면? \n 사용!(줄바꿈)
		System.out.println("HTML\nCSS\nJAVASCRIPT");
	}

}

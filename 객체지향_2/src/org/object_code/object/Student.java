package org.object_code.object;

public class Student {
  int score_Kor;
  int score_Eng;
  
  int sum() {
	  return this.score_Kor+this.score_Eng;
	  //this = 내부클래스, 외부 클래스는 클래스명으로 선언
	  
  }
}

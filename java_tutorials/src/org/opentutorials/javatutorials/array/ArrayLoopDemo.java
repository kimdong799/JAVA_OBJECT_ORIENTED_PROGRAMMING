package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[]members = {"김동현","홍예원","김정의","김영돌","김태현"};
		for(int i=0; i<members.length; i++) {
		//	String member = members[i];
			System.out.println(members[i]+"이 상담을 받았습니다.");
		}
	}
}

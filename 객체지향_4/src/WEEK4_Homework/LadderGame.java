package WEEK4_Homework;

import java.util.Random;
import java.util.Arrays;

public class LadderGame {

	public static void main(String[] args) {

		Random rd = new Random();
		
		System.out.println("* 사다리 게임 *");
		
		int ladder[][] = new int[15][7];
				
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=7; j++) {
				
				if (i>7)System.out.print("?");
				else if (j%2 ==1)System.out.print("|");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("* 사다리 게임 실행결과 *");
		System.out.println();
		
		int ladder2[][] = new int[15][7];
		
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=7; j++) {
				
				if(j%2==1)System.out.print("|");
				else {
					int random = rd.nextInt(2);
		
					if(i>7 && random==1)System.out.print("―");
					else System.out.print(" ");
				}
			}
			System.out.println();
		

		}
	}
}


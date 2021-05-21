package Practice;

public class random {
	
	double r;
	
	public void random1() {
		r = Math.random();
		if(r>=0.5)System.out.println("0.5 이상.");
		else System.out.println("0.5 미만");
	}
	public void random2() {
		int sum=0;
		for(int i=0; i<1000; i++) {
			r = Math.random();
			if(r>0.5)r=1;
			else r=0;
			sum+=r;
		}
		System.out.println(sum*0.1);
	}
	public void random3() {
		int sum=0;
		for(int i=0; i<1000; i++) {
			r = Math.random();
			if(r>0.3)r=1;
			else r=0;
			sum+=r;
		}
		System.out.println(sum*0.1);
	}

	public static void main(String[] args) {
		random r = new random();
		
		r.random1();
		r.random2();
		r.random3();
	}

}

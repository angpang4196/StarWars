package com.biz.star;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을 
		 * 계산하여 콘솔에 보여주는 코드를 작성하세요.
		 * 30,40
		 * 50,20
		 * 100,200
		 * 3,100
		 * 5,20
		 */
		calSum(30, 40);
		calSum(50, 20);
		calSum(100, 200);
		calSum(3, 100);
		calSum(5, 20);
		calMul(30, 40);
		calMul(50, 20);
		calMul(100, 200);
		calMul(3, 100);
		calMul(5, 20);
		

	}
	public static void calSum(int intcal1, int intcal2) {
	
		int calSum = (intcal1 + intcal2);
		
		System.out.println("두 수의 덧셈결과는 " + (intcal1 + intcal2));
	}
		
	
	public static void calMul(int intcal1, int intcal2) {
		
		int calMul = (intcal1 * intcal2);
		System.out.println("두 수의 곱셈결과는 " + (intcal1 * intcal2));
		
	}
}

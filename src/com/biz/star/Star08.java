package com.biz.star;

public class Star08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method의 이름이 같고 매개 변수의 개수가 같으면 그 같은 이름의 method를 사용할 수있다.
		/*
		 * method를 정의할 때 같은 class 내부에서는 원칙적으로 변수와 같이 같은 이름의 method를 정의(선언)할 수없다.
		 * 
		 * 하지만 Java에서는(Java의 특징중 한가지) 매개 변수의 개수가 다르면 같은 이름의 method를 정의할 수 있다.
		 * => 중복정의(OverLoadig) 가능이라고 한다. 
		 */
		addNum();
		addNum(30);
		addNum(9);
		addNum(3,4);

	}
	
	public static void addNum() {
		System.out.println("매개 변수가 없는 method");
	}
	
	public static void addNum(int intNum) {
		if(intNum > 10) {
			System.out.println("10보다 큰 값의 매개 변수");
		} else {
			System.out.println("10이하의 매개 변수");
		}
	}
	
	public static void addNum(int intNum1, int intNum2) {
		System.out.println(intNum1 + intNum2);
	}

}

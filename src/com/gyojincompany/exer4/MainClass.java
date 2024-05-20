package com.gyojincompany.exer4;

public class MainClass {
	public static void main(String[] args) {
		// Car car = new Car(); // 인터페이스는 new 연산자로 객체 생성 불가
		
		Truck truck = new Truck();
		
		Car car;//인터페이스 객체(변수) 선언
		
		car = truck; // 업캐스팅 가능
		
		car.frontDrive();
		
		
	}
}

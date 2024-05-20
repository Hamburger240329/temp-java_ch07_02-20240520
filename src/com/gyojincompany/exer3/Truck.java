package com.gyojincompany.exer3;

public class Truck extends Car{
	
	//부모클래스의 추상메소드는 반드시 오버라이딩해서 자식클래스에서 사용해야함!!!
	public void drive() {//Car 클래스의 추상메소드인 drive메소드를 오버라이딩 함
		System.out.println("트럭 운전");
	}

}

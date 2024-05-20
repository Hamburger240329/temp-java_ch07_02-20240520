package com.gyojincompany.exer3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car = new Car(); //추상클래스는 객체를 생성할 수 없다!
		//->추상클래스->객체의 기본 설계도 역할만 한다->상속 용도로만 사용
		
		//Phone phone = new Phone(); // 추상클래스는 객체를 선언할 수 없다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
	}	
		

}

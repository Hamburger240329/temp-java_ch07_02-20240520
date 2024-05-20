package com.gyojincompany.exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(); // 자식객체인 cat 객체 선언
		
		Animal animal = new Animal(); // 부모객체인 animal 객체 선언 
		
		int a=1;
		byte b=10;
		a = b;
		// b = a; // 에러발생!
		double c=1.5;
		int d = 10;
		// d = (int)c; 
		
		animal = cat;// 업캐스팅->자식클래스의 객체가 부모클래스 타입으로 형변환 되는 것
		// cat = animal; // 에러발생!
		cat = (Cat) animal; // 다운캐스팅->부모클래스의 객체가 자식클래스 타입으로 형변환 되는 것
		
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Cat cat1 = new Cat();	
		
		
		Animal animal1 = new Animal();
		
		animal1 = new Dog(); //업캐스팅
		animal1 = new Tiger();
		animal1 = new Cat();
		
		
	}

}

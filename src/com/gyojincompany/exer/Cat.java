package com.gyojincompany.exer;

public class Cat extends Animal{ //Animal 클래스를 상속 받음
	String catName;
	
	public void catWorking() {
		System.out.println("고양이가 걷는다.");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
		
	}
	
	
	
}

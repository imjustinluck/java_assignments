package com.jda.inter;

public class BicycleTest {

	public BicycleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(Bicycle.myConstant);
		Bicycle b = new Bicycle();
		
		b.sayHello();
		Bicycle.staticMethod();
		b.speedUp(3);
		b.applyBrakes(2);
		System.out.println(b.getSpeed());
	}

}

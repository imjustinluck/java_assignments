package com.jda.inter;

public interface OperateBicycle {
	public static final double myConstant = 3.0;
	
	default void sayHello() {
		System.out.println("Hello!");
	}
	
	static void staticMethod() {
		System.out.println("Hello static method");
	}
	
	void speedUp(int increment);
	void applyBrakes(int decrement);
}

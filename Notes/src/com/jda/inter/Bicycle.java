package com.jda.inter;

public class Bicycle implements OperateBicycle {

	private int speed;
	
	public Bicycle() {
		this.speed = 0;
	}
	
	public static void staticMethod() {
		OperateBicycle.staticMethod();
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;

	}

	public int getSpeed() {
		return speed;
	}
}

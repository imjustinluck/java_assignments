package com.jda.phones;

public class PhoneTest {

	public static void main(String[] args) {
		IPhone i = new IPhone("X", 100, "AT&T", "Boom Goes The Dynamite");
		Galaxy g = new Galaxy("S9", 99, "Verizon", "Ring");
		i.displayInfo();
		g.displayInfo();
		
		System.out.println(i.ring());
		System.out.println(i.unlock());
		
		System.out.println(g.ring());
		System.out.println(g.unlock());
	}

}

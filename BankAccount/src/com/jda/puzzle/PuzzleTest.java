package com.jda.puzzle;
import java.util.Arrays;


public class PuzzleTest {

	public PuzzleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PuzzleJava p = new PuzzleJava();
		
		System.out.println(Arrays.toString(p.generate()));

		
		System.out.println(p.getRandom());
		
		System.out.println(p.generatePassword());
		
		System.out.println(Arrays.toString(p.passwordSet(7)));
	}
	
	

}

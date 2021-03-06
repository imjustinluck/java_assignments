package com.jda.puzzle;
import java.util.Random;

public class PuzzleJava {

	public PuzzleJava() {
		// TODO Auto-generated constructor stub
	}
	
	Random r = new Random();
	
	public int[] generate() {
		int[] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = r.nextInt(20);
		}
		return arr;
	}

	public String getRandom() {
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		return alpha[r.nextInt(25)];
	}
	
	public String generatePassword() {
		String pass = "";
		for(int i=1; i<=8; i++) {
			pass+=this.getRandom();
		}
		return pass;
	}
	
	public String[] passwordSet(int length) {
		String[] set = new String[length];
		for(int i=0; i<length; i++) {
			set[i] = this.generatePassword();
		}
		return set;
	}
}

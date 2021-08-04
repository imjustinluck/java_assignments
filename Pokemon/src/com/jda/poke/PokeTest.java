package com.jda.poke;

public class PokeTest {

	public static void main(String[] args) {
		Pokemon charmander = new Pokemon("Charmander", 100, "fire");
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 25, "grass");
		
		charmander.attackPokemon(bulbasaur);
		
		Pokedex dex = new Pokedex();
		dex.create("Charmander", 200, "Fire");
		dex.create("Bulbasaur", 200, "Water");
		
		dex.listPokemon();
	}

}

package com.jda.poke;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	public ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public Pokedex(){
	}

	public void create(String name, int health, String type) {
		Pokemon poke = this.createPokemon(name, health, type);
		myPokemons.add(poke);
	}
	
	@Override
	public void listPokemon() {
		for(Pokemon poke : myPokemons) {
			System.out.println(poke.getName());
		}
	}

}

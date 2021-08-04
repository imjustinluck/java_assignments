package com.jda.poke;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon poke = new Pokemon(name, health, type);
		return poke;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String info = pokemon.getName() + " " + pokemon.getHealth() + " " + pokemon.getType();
		return info;
	}

}

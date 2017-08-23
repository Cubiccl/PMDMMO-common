package com.darkxell.common.pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class PokemonSpecies
{

	public final int id, formID;
	/** List of moves learned by leveling up. Key is level, value is the list of move IDs. */
	private final HashMap<Integer, ArrayList<Integer>> learnset;
	public final String name;
	public final float recruitRate;
	public final PokemonStats stats;
	/** List of TMs that can be taught. */
	private final ArrayList<Integer> tms;
	/** This Pokémon's types. type2 can be null. */
	public final PokemonType type1, type2;

	public PokemonSpecies(int id, int formID, String name, PokemonType type1, PokemonType type2, PokemonStats stats, float recruitRate)
	{
		this.id = id;
		this.formID = formID;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.stats = stats;
		this.recruitRate = recruitRate;
		this.learnset = new HashMap<Integer, ArrayList<Integer>>();
		this.tms = new ArrayList<Integer>();
	}

}

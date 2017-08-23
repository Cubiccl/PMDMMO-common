package com.darkxell.common.move;

import com.darkxell.common.pokemon.PokemonType;

public abstract class Move
{
	/** Move categories.<br />
	 * <ul>
	 * <li>PHYSICAL = 0</li>
	 * <li>SPECIAL = 1</li>
	 * <li>STATUS = 2</li>
	 * </ul> */
	public static final byte PHYSICAL = 0, SPECIAL = 1, STATUS = 2;

	/** This move's accuracy. */
	public final int accuracy;
	/** This move's category. See {@link Move#PHYSICAL}. */
	public final byte category;
	/** This move's ID. */
	public final int id;
	/** This move's name. */
	public final String name;
	/** This move's power. */
	public final int power;
	/** This move's Power Points. */
	public final int pp;
	/** This move's type. */
	public final PokemonType type;

	public Move(int id, String name, PokemonType type, byte category, int power, int pp, int accuracy)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.power = power;
		this.pp = pp;
		this.accuracy = accuracy;
	}

}

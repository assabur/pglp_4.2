package fr.uvsq.solid.pglp_4;

public class Quit implements GeneriqueCommand {
/**
 * methode apply de notre command quit
 */
	
	public void apply()
	{
		System.exit(0);
	}
	
}

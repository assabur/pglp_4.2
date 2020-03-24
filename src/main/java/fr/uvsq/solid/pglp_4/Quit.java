package fr.uvsq.solid.pglp_4;

public class Quit implements GeneriqueCommand {
/**
 * methode apply de notre command quit
 */
  Receiver_Generic rg=new Receiver_Generic();
			
	public void apply()
	{
		rg.quit();
	}
	
}

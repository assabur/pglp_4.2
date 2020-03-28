package fr.uvsq.solid.pglp_4;

import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

public class Quit implements GeneriqueCommand {
/**
 * methode apply de notre command quit
 */
  private Receiver_Generic rg;
  
  
  public Quit(Receiver_Generic receiver)
  {
	  this.rg=receiver;
	 
  }
	public void apply()
	{
		rg.quit();
	}
	
}

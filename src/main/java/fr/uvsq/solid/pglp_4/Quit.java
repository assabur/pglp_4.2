package fr.uvsq.solid.pglp_4;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;
/*
 * classe qui implemente la commande de sortie du programme
 */
public class Quit implements GeneriqueCommand {
	
  private Receiver_Generic rg;
  public Quit(Receiver_Generic receiver)
	  {
		  this.rg=receiver;	 
	  }
	  /*
	   * application de l'operation quit
	   * @see fr.uvsq.solid.pglp_4.GeneriqueCommand#apply()
	   */
		public void apply()
		{
			rg.quit();
		}
}

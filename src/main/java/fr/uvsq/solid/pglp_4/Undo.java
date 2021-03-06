package fr.uvsq.solid.pglp_4;

import Exception.HistorisationException;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;
/*
 * classe Undo qui implements une commande generique
 */
public class Undo implements GeneriqueCommand {
	private MoteurRpn moteur;
	private Receiver_Generic rg;
	/*
	 * methode qui recupere la pile du moteur pour en faire un undo
	 * @see fr.uvsq.solid.pglp_4.GeneriqueCommand#apply()
	 */
	public Undo (Receiver_Generic receiver,MoteurRpn moteur) 
	{
		this.moteur=moteur;
		this.rg=receiver;
	}
	/*
	 * application de la methode apply qui utilise un receiver
	 * @see fr.uvsq.solid.pglp_4.GeneriqueCommand#apply()
	 */
	public void apply() 
	{
		try {
			rg.undo(this.moteur);
		} catch (HistorisationException e)
		{		
			e.getMessage();
		}
		 catch (Pile_vide_exception e)
		{		
			e.getMessage();
		}
	}
}

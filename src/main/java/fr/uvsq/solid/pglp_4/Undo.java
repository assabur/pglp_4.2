package fr.uvsq.solid.pglp_4;

import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

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
	public void apply() {
		rg.undo(moteur.pile);
	} 
}

package fr.uvsq.solid.pglp_4;

import java.util.Stack;

import Exception.HistorisationException;
import Exception.Pile_vide_exception;

/**
 * implementation des methodes generiques quit et undo
 */
public class Receiver_Generic {
	/*
	 * implementations de la methode quit
	 */
	public void quit()
	{
		System.exit(0);
	}
	/*
	 * implementation de la methode undo
	 */
	public void undo (MoteurRpn moteur ) throws HistorisationException,Pile_vide_exception
	{
		if(moteur.pile.isEmpty())
			throw new HistorisationException();
		else 
			{ //moteur.depiler();
			 moteur.pile=moteur.get_history();
			}
		   //moteur.affiche();
	}
}

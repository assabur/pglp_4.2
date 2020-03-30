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
		 
		if(moteur.size() == moteur.test_size)		{	
				 moteur.pile_remove();
				// System.out.println("history saisi ");
				 moteur.enregistrer(moteur.history2);
				 moteur.enregistrer(moteur.history1);
		}
			 
	}
}

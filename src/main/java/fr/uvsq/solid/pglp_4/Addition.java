package fr.uvsq.solid.pglp_4;

import Exception.ManqueOperandeException;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;
/*
 * classe addition qui implemente une commande specifique
 */
public class Addition implements SpecificCommand {
	/*
	 * definitiion des attributs requis
	 */
	 private Receveir_specific receiver;
	 private final MoteurRpn moteur;
	 private double a,b;
	 /*
	  * constructeur
	  */
    public Addition(Receveir_specific receiver, MoteurRpn moteur) 
    {
    	this.receiver=receiver;
    	this.moteur=moteur; 	
    }
	/*
	 * application de la methode apply qui utilise un receiver
	 */
	public void apply()
	{	
		try
		{
			this.a=moteur.depiler();	
			this.b=moteur.depiler();
			moteur.enregistrer(receiver.addition(a, b));
		}
		catch(Pile_vide_exception e)
		{ 
			moteur.enregistrer(a);
				e.getMessage();
		}
		catch(ManqueOperandeException e)
		{ 
				e.getMessage();
		}
				
}}

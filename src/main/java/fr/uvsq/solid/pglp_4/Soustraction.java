package fr.uvsq.solid.pglp_4;

import Exception.ManqueOperandeException;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

/*
 * classe implementant la soustraction à l'aide du receiver
 * 
 */
public class Soustraction implements SpecificCommand {	
	private double a,b;
	private Receveir_specific receiver;
	private MoteurRpn moteur;
	/*
	 * constructeur
	 */
	public Soustraction(Receveir_specific receiver,MoteurRpn moteur) 
	{
		this.receiver=receiver;
		this.moteur=moteur;
	
	}
	
	public void apply() {
		try
		{
		this.a=moteur.depiler();
		this.b=moteur.depiler();
		moteur.enregistrer( receiver.soustraction(a, b));

		}
		catch (Pile_vide_exception e)
		{
			//if(a instanceof double)
			moteur.enregistrer(a);
			e.getMessage();
		}
		catch(ManqueOperandeException e)
		{ 
				e.getMessage();
		}
		
	}
}

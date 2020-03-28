package fr.uvsq.solid.pglp_4;

import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

/*
 * classe implementant la division à l'aide du receiver
 */
public class Division implements SpecificCommand{
	private double a,b;
	private Receveir_specific receiver;
	private MoteurRpn moteur;
	
	public Division(Receveir_specific receiver,MoteurRpn moteur) 
	{
		this.moteur=moteur;
		this.receiver=receiver;
	}
	
	public void apply()
	{
		 
		try
		{
		this.a=moteur.depiler();
		this.b=moteur.depiler();
		}
		catch (Pile_vide_exception e)
		{
			e.getMessage();
		}
		moteur.enregistrer(receiver.division(a, b));	
	}
}


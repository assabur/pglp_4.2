package fr.uvsq.solid.pglp_4;

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
		}
		catch (Pile_vide_exception e)
		{
			e.getMessage();
		}
		moteur.enregistrer( receiver.soustraction(a, b));
		
	}
}

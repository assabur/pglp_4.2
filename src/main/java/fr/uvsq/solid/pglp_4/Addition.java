package fr.uvsq.solid.pglp_4;

import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

public class Addition implements SpecificCommand {
	
	 private Receveir_specific receiver;
	 private final MoteurRpn moteur;
	 private double a,b;
 
    public Addition(Receveir_specific receiver, MoteurRpn moteur) 
    {
    	this.receiver=receiver;
    	this.moteur=moteur;
    	
    }
	
	public void apply()
	{
		try
		{this.a=moteur.depiler();		
		this.b=moteur.depiler();
		}
		catch(Pile_vide_exception e)
			{ 
				e.getMessage();
			}
		moteur.enregistrer(receiver.addition(a, b));
		/*try
		{		moteur.affiche();}
		catch(Pile_vide_exception e)
		{
			e.getMessage();
		}*/
	}
}

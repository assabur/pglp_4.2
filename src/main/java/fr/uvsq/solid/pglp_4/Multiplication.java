package fr.uvsq.solid.pglp_4;

import Exception.ManqueOperandeException;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

/*
 * classe implementant la multiplication à l'aide du receiver
 */
public class Multiplication implements SpecificCommand {
	private double a,b;
	private MoteurRpn moteur;
	private Receveir_specific receiver;
	/*
	 * constructeur
	 */
	public Multiplication (Receveir_specific receiver,MoteurRpn moteur)
	{		
		this.receiver=receiver;	
		this.moteur=moteur;	
	}
	/*
	 * methode qui applique la multiplication en utilisant un receicer
	 * @see fr.uvsq.solid.pglp_4.SpecificCommand#apply()
	 */
	public void apply() 
	{
		try
			{this.a=moteur.depiler();		
			this.b=moteur.depiler();
			moteur.enregistrer(receiver.multiplication(a, b));
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
			//System.out.println("passer multiplixation");
			
	}
}

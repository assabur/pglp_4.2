package fr.uvsq.solid.pglp_4;

import Exception.ManqueOperandeException;

/*
 * classe implementant la multiplication à l'aide du receiver
 */
public class Multiplication implements SpecificCommand {
	private double a,b;
	private Interpreteur interpreteur;
	Receveir_specific receiver=new Receveir_specific();

	public Multiplication (Interpreteur interpreteur)
	{		
		this.interpreteur=interpreteur;
		this.a=interpreteur.moteur.depiler();		
		this.b=interpreteur.moteur.depiler();
	}
	
	public void apply() {
			System.out.println("passer");
		interpreteur.moteur.enregistrer(receiver.multiplication(a, b));
	}
}

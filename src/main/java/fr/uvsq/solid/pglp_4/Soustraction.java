package fr.uvsq.solid.pglp_4;
/*
 * classe implementant la soustraction à l'aide du receiver
 * 
 */
public class Soustraction implements SpecificCommand {
	private Receveir_specific receiver= new Receveir_specific();
	private double a,b;
	public Soustraction(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		
		receiver.soustraction(a, b);
		
	}
}

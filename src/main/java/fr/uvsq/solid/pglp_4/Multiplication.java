package fr.uvsq.solid.pglp_4;
/*
 * classe implementant la multiplication à l'aide du receiver
 */
public class Multiplication implements SpecificCommand {
	private double a,b;
	Receveir_specific receiver=new Receveir_specific();

	public Multiplication (double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		receiver.multiplication(a, b);		
	}
}

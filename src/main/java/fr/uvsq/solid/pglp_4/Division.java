package fr.uvsq.solid.pglp_4;
/*
 * classe implementant la division à l'aide du receiver
 */
public class Division implements SpecificCommand{
	private double a,b;
	Receveir_specific receiver=new Receveir_specific();
	
	public Division(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
	receiver.division(a, b);
		
	}
	
}


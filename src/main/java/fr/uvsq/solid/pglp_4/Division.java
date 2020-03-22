package fr.uvsq.solid.pglp_4;

public class Division implements SpecificCommand{
	private double a,b;
	
	public Division(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		this.operation();
		
	}
	
	/**
	 * méthode de l'opération de division
	 */
	public double operation()
	{
		return this.a/this.b;
	}
}


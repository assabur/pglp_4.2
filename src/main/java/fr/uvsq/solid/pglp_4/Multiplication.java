package fr.uvsq.solid.pglp_4;

public class Multiplication implements SpecificCommand {
	private double a,b;
	
	public Multiplication (double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		this.operation();
		
	}
	
	/**
	 * méthode de l'opération de multiplication
	 */
	public double operation()
	{
		return this.a*this.b;
	}

}

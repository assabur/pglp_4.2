package fr.uvsq.solid.pglp_4;

public class Soustraction implements SpecificCommand {
	private double a,b;
	
	public Soustraction (double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		this.operation();
		
	}
	
	/**
	 * méthode de l'opération de soustraction
	 */
	public double operation()
	{
		return this.a-this.b;
	}

}

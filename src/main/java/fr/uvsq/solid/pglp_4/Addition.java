package fr.uvsq.solid.pglp_4;

public class Addition implements SpecificCommand {
	
	private double a,b;
	
	public Addition (double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void apply() {
		this.operation();
		
	}
	
	/**
	 * méthode de l'opération de l'addition
	 */
	public double operation()
	{
		return this.a+this.b;
	}

}

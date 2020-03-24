package fr.uvsq.solid.pglp_4;

public class Addition implements SpecificCommand {
	
	 private Receveir_specific receiver;
	 private double a,b;
 
    public Addition(double a,double b)
    {
    	this.a=a;
    	this.b=b;
    }
	
	public void apply() {
		receiver.addition(a, b);	
	}
}

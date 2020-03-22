package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;

public class MoteurRpn {

	protected HashMap<String , SpecificCommand> macommande;
	Stack pile=new Stack<Double>();
	
	void enregistrer(double a)
	{
		pile.add(a);
	}
	
    public double depiler() 
    { 	
    		return (Double) pile.pop();
    }


    public double apply (char symbole) 
    
	 {
	    
    	    
	 }
	    
}

package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;

public class MoteurRpn {

	protected HashMap<String , SpecificCommand> macommande;
	Interpreteur interpreteur=new Interpreteur();
	Receiver_Generic generic=new Receiver_Generic();
	Receveir_specific specific=new Receveir_specific();
	SaisieRpn saisie= new SaisieRpn();
	Stack pile=new Stack<Double>();
	/**
	 * méthode permettant 
	 * l'enregistrement d'une operande
	 * @param a
	 */
	
	void enregistrer(double a)
	{
		pile.add(a);
	}
	/**
	 * retirer un element de la pile
	 * @return
	 */
    public double depiler() 
    { 	
    	return (Double) pile.pop();
    }

	/**
	 * methode d'affichage de la pile
	 * @return
	 */
    public void affiche() {
    	System.out.print("L'expression courante est:\t");
    	if(!this.pile.isEmpty()) {
    		for(int i=0;i< this.pile.size();i++){
    			System.out.print(this.pile.elementAt(i)+"\t");
    		}	
    	}
    	System.out.println("");
    }
    
    /*
     * on applique une operation sur les operandes à travers l'interpreteur 
     */
    public void apply_operation (char a) 
	 {
    	switch(a)
    	{
    	case '/': interpreteur.executeCommand("division");break;
    	case '-': interpreteur.executeCommand("soustraction");break;
    	case '+': interpreteur.executeCommand("addition");break;
    	case '*': interpreteur.executeCommand("multiplication");break;
    	default:break;
    	}   
	 }	    
}

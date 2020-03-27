package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;

import Exception.Pile_vide_exception;

public class MoteurRpn {


	protected  Interpreteur interpreteur;
	Receiver_Generic generic=new Receiver_Generic();
	Receveir_specific specific=new Receveir_specific();
	//protected  String saisie;
	protected Stack <Double> pile=new Stack<Double>();
	
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
    	if(this.pile.isEmpty()) 
    	{
   		  throw new Pile_vide_exception() ;
	    }
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
    public void apply_operation (String saisie ) 
	 { 
    	System.out.println("passe apply");
    	 interpreteur=interpreteur.init(this);    	 
    	 interpreteur.executeCommand(saisie); 	 
     }   	 	    
}

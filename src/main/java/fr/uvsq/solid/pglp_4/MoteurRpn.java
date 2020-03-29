package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;

import Exception.CommandeException;
import Exception.Pile_pleine_exception;
import Exception.Pile_vide_exception;

public class MoteurRpn {

		protected  Interpreteur interpreteur=new Interpreteur();
		private Receiver_Generic generic=new Receiver_Generic();
		private Receveir_specific specific=new Receveir_specific();
		public Stack <Double> pile=new Stack<Double>();
		protected HashMap<Integer, Stack<Double>> history_stack=new HashMap<Integer, Stack<Double>>();
		private GeneriqueCommand quit=new Quit(generic);
	    private GeneriqueCommand undo=new Undo(generic,this);
	    private SpecificCommand multiplication=new Multiplication(specific,this);
	    private SpecificCommand division=new Division(specific,this);
	    private SpecificCommand soustraction=new Soustraction(specific,this);
	    private SpecificCommand addition=new Addition (specific,this);
	
	/**
	 * méthode permettant /*
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
    public double depiler() throws Pile_vide_exception
    { 	
    	if(this.pile.isEmpty()) 
    	{
   		  throw new Pile_vide_exception();
	    }
    	
    	return  pile.pop();
    }
    
    public void save (int save_number) throws Pile_vide_exception
    {
    	Stack<Double> tampon =new Stack<Double>();
    	int taille=this.pile.size(),i=0,test=0;
    	while (i<taille)
    	{
    		tampon.push(this.pile.get(i));
    		i++;
    	}
    	history_stack.put(save_number,tampon);
    	while (test<history_stack.size())
    	{
    		System.out.println("affiche history "+history_stack.get(test).get(test));
    		test++;
    	}
    	
    	// this.enregistrer(peek);
    }
    
    public  Stack<Double> get_history()
    {
    	int test=1,i=1,taille;
    	taille=history_stack.size();
    	/*while(taille >2)
    	{
    		history_stack.remove(i);
    		i++;
    	}*/
    	//System.out.println("test history");
    	return history_stack.get(taille);
    }
    
	/**
	 * methode d'affichage de la pile
	 * @return
	 */
    public void affiche() throws Pile_vide_exception
    {
    	System.out.print("L'expression courante est:\t");
    	if(!this.pile.isEmpty()) {
    		for(int i=0;i< this.pile.size();i++){
    			System.out.print(this.pile.elementAt(i)+"\t");
    		}	
    	}
    	System.out.println("");
    }
    
    public void init()  
	{			
		this.interpreteur.addCommand("quit",this.quit);
		this.interpreteur.addCommand("undo",this.undo);
		this.interpreteur.addCommand("*",this.multiplication);
		this.interpreteur.addCommand("+",this.addition);
		this.interpreteur.addCommand("/",this.division );
		this.interpreteur.addCommand("-",this.soustraction); 	 	
	}	
    /*
     * on applique une operation sur les operandes à travers l'interpreteur 
     */
    public void apply_operation (String saisie ) throws CommandeException
	 { 
 		// System.out.println("passe apply1");
    	 this.interpreteur.executeCommand(saisie);
    	// System.out.println("passe apply2");    	 
     }   	 	    
}

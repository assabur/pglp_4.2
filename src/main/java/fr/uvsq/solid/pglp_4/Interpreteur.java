package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
/*
 * implementation de la calsse interpreteur
 */

public class Interpreteur {
	private  HashMap<String, CommandInterface> commande;
	/*
	 * definition du constructeur
	 */
	public  Interpreteur()
	{
		this.commande=new HashMap<String, CommandInterface>();	
	}
	
	/*
	 * methode permettant d'ajouter une commande
	 */

	public void addCommand(String name,CommandInterface command)
	{
		
		this.commande.put(name, command);
	}
	
	/*
	 * methode qui permet une fois retrouver le nom d'une commande d
	 * de l'executer
	 */
	public void executeCommand (String name)
	{
		if(this.commande.containsKey(name))
		{
			this.commande.get(name).apply();
		}	
	}
	
	/*
	 * créons une  méthode static pour initialiser undo et quit
	 */
	public static Interpreteur init()
	{		
		Quit quit= new Quit();
		
		Interpreteur interpreteur= new Interpreteur();
		interpreteur.addCommand("quit", quit);
		
		return interpreteur;
		
	}
	
	
	
	
	
	
	
	
}

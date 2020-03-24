package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;
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
	 * methode qui permet une fois retrouver le nom d'une commande de
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
	 * créons une  méthode static pour initialiser les operations generiques et statiques
	 */
	public static Interpreteur init()
	{		
		double a,b;
		MoteurRpn moteur= new MoteurRpn();
		a= moteur.depiler();
		b=moteur.depiler();
		
		
		Interpreteur interpreteur= new Interpreteur();
		interpreteur.addCommand("quit", new Quit());
		interpreteur.addCommand("undo", new Undo());
		interpreteur.addCommand("*", new Multiplication(a, b));
		interpreteur.addCommand("+", new Addition(a, b));
		interpreteur.addCommand("/", new Division(a, b));
		interpreteur.addCommand("-", new Soustraction(a,b));
		 
		return interpreteur;
		
	}
	
	
	
	
	
	
	
	
}

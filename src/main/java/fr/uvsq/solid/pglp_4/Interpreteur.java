package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
/*
 * implementation de la calsse interpreteur
 */

public class Interpreteur {
	private  HashMap<String, CommandInterface> listedescommande;
	MoteurRpn moteur;//= new MoteurRpn();
	//protected 
	/*
	 * definition du constructeur
	 */
	public  Interpreteur()
	{
		this.listedescommande=new HashMap<String, CommandInterface>();	
	}
	
	/*
	 * methode permettant d'ajouter une commande
	 */

	public void addCommand(String name,CommandInterface command)
	{
		
		this.listedescommande.put(name, command);
	}
	
	/*
	 * methode qui permet une fois retrouver le nom d'une commande de
	 * de l'executer
	 */
	public void executeCommand (String name)
	{
		 CommandInterface usercommand = listedescommande.get(name);
	        if (usercommand == null) {
	            throw new IllegalStateException("pas de commande enregistré pour " + name);
	        }
	        System.out.println("passe avant interpreteur");
	        usercommand.apply();
	        System.out.println("passe apres interpretreur");
	}
	/*
	 * créons une  méthode static pour initialiser les operations generiques et statiques
	 */
	public Interpreteur init(MoteurRpn moteur)
	{	
		this.moteur=moteur;		
		
		this.addCommand("quit", new Quit());
		this.addCommand("undo", new Undo());
		this.addCommand("*", new Multiplication(this));
		//interpreteur.addCommand("+", new Addition(a, b));
		//interpreteur.addCommand("/", new Division(a, b));
		//.addCommand("-", new Soustraction(a,b)); 	 
		return this;
	
	}	
}

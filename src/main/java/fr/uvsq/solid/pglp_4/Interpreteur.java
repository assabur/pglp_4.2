package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
/*
 * implementation de la calsse interpreteur
 */

public class Interpreteur {
	private  HashMap<String, CommandInterface> listedescommande=new HashMap<String, CommandInterface>();
	
	/*
	 * methode qui permet une fois retrouver le nom d'une commande de
	 * de l'executer
	 */
	public void executeCommand (String name)
	{
		System.out.println("entrer dans execute");
		 CommandInterface usercommand = listedescommande.get(name);
	        if (usercommand == null) {
	            throw new IllegalStateException("pas de commande enregistré pour " + name);
	        }
	        System.out.println("passe avant interpreteur");
	        usercommand.apply();
	        System.out.println("passe apres interpretreur");
	}
	
	/*
	 * methode permettant d'ajouter une commande
	 */

	public void addCommand(String name,CommandInterface command)
	{		
		this.listedescommande.put(name, command);
	}	
}

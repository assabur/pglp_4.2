package fr.uvsq.solid.pglp_4;

import java.util.Scanner;

public class SaisieRpn {

	/**
	 * rep: variable de saisie
	 * Moteur_Rpn: instance du Moteur RPN
	 * saisie: saisie de l'utilisateur
	 */
	private Scanner reponse=new Scanner(System.in);
	public MoteurRpn moteur =new MoteurRpn();
	private String saisie=new String();
	
	/**
	 * Fonction d'interaction avec l'utilisateur et qui invoque le Moteur RPN
	 * 
	 */
	/*public void reception() 
	{
		System.out.println("L'expression courante est: ");
		do{
			this.saisie=reponse.nextLine();
			if(!this.saisie.equals("exit")){
					UseMoteur();
			}
		}while(!this.saisie.equals("exit"));		
	}*/
	
	/**
	 * Fonction qui permet de verifier si utilisateur a saisie une operande ou un operateur
	 * et renvoi un booleen
	 * @param val : valeur saisie par utilisateur
	 * @return Renvoi Vrai si c'est une operande et Faux si non
	 */
	public boolean verifisaisie(String val){
		try{
			double test=Double.parseDouble(val);
		}
		catch(Exception e)
		{
			return false;
		} 
		return true;
	}
	
	/**
	 * Methode qui s'ocuppe des operations necessaire en fonction de la saisie de l'utilisateur
	 * @throws ClasseException : Exception qui gï¿½re la division par zero
	 * @throws PilevideException
	 * @throws ManqueOperandeException : Exception qui gï¿½re le manque
	 * d'oprande pour effectuer un calcul
	 */
	public void UseMoteur() 
	{
		if(verifisaisie(this.saisie)==false){
			try {
					if(this.saisie.equals("+")||this.saisie.equals("-")||this.saisie.equals("*")||this.saisie.equals("/")){
						moteur.apply_operation(this.saisie.charAt(0));
						moteur.affiche(); //(this.saisie);
					}else{
						System.out.println("Erreur de saisie ");
					}
				} catch (Exception e) {
				
				}
		}else{
			moteur.enregistrer(Double.parseDouble(saisie));     //(Double.parseDouble(saisie));
			moteur.affiche();
		}
		
	}
	
	/**
	 * Methode qui permet d'afficher l'expression courante
	 * @param saisi : operande saisie par utilisateur
	 */
    /*public void affichage(String saisi){
    	System.out.print("L'expression courante est:\t");
    	if(!moteur.pile.isEmpty())
    		for(int i=0;i< moteur.pile.size();i++){
    			System.out.print(moteur.pile.elementAt(i)+"\t");
    		}
    }	*/


   
}

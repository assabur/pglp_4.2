package fr.uvsq.solid.pglp_4;

import java.util.Scanner;

import Exception.ManqueOperandeException;
import Exception.Pile_vide_exception;

public class SaisieRpn {

	/**
	 * rep: variable de saisie
	 * Moteur_Rpn: instance du Moteur RPN
	 * saisie: saisie de l'utilisateur
	 */
	static Scanner reponse=new Scanner(System.in);
	static MoteurRpn moteur =new MoteurRpn();
	private String saisie=new String();
	
	/**
	 * Fonction d'interaction avec l'utilisateur et qui invoque le Moteur RPN
	 * 
	 */
	public void reception() throws ManqueOperandeException
	{
		System.out.println("L'expression courante est: ");
		do{
			this.saisie=reponse.nextLine();
			if(!this.saisie.equals("exit")){
					UseMoteur();
			}
		}while(!this.saisie.equals("exit"));		
	}
	
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
	public void UseMoteur() throws Pile_vide_exception,ManqueOperandeException
	{
		if(verifisaisie(this.saisie)==false){
			try {
					if(this.saisie.equals("+")||this.saisie.equals("-")||this.saisie.equals("*")||this.saisie.equals("/")){
						moteur.apply_operation(this.saisie);
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
}

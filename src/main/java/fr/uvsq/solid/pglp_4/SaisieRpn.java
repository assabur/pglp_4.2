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
	private final Scanner reponse=new Scanner(System.in);
	private  MoteurRpn moteur =new MoteurRpn();
	private String saisie=new String();
	private int saisie_id=0;

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
	public void reception() throws ManqueOperandeException, Pile_vide_exception
	{
		moteur.init();
		//
		System.out.println("L'expression courante est: ");
		do{
			this.saisie=reponse.nextLine();			
			UseMoteur();			
		}while(true );		
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
		if(verifisaisie(this.saisie)==false)
		{
			try 
			{
				//if(this.saisie.equals("quit")||this.saisie.equals("undo")||this.saisie.equals("+")||this.saisie.equals("-")||this.saisie.equals("*")||this.saisie.equals("/")){			
				moteur.apply_operation(this.saisie);
				//moteur.save(this.saisie_id +1);
				//saisie_id++;
				//System.out.println("saisi id passer");
			} catch (Exception e) {}
	
		}else
		{
			moteur.enregistrer(Double.parseDouble(saisie)); 
			//moteur.save(this.saisie_id+1);
			//saisie_id++;
			//moteur.affiche();
		}
		moteur.affiche();
	}   
}

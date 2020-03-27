package fr.uvsq.solid.pglp_4;

import Exception.Arithmetic_exception;
import Exception.ManqueOperandeException;
import Exception.Pile_vide_exception;
/*
 * classe correspondant à testé notre calculatrice: programme principal
 */
public class Calculatrice_Rpn {
/*
 * methode main de notre calculatrice
 */
	public static void main(String[] args) throws Arithmetic_exception, Pile_vide_exception,ManqueOperandeException {
		// TODO Auto-generated method stub
		SaisieRpn cal = new SaisieRpn();
		try{
			cal.reception();
		}catch(Exception e){}
		System.out.println("FIN");		
}}
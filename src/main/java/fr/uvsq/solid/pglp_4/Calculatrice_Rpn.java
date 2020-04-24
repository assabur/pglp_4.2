package fr.uvsq.solid.pglp_4;

import java.util.HashMap;
import java.util.Stack;

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
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SaisieRpn cal = new SaisieRpn();
		try{
			cal.reception();
		}
		catch(Pile_vide_exception e)
		{
			e.getMessage();
		}
		catch(ManqueOperandeException e)
		{
			e.getMessage();
		}
		System.out.println("FIN");		
	}
	}

	


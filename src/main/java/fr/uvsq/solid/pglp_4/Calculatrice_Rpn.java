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
		/*Stack <Double> pile=new Stack<Double>();
		 Stack <Double> pile1=new Stack<Double>();
		 Stack <Double> pile2=new Stack<Double>();
		 Stack <Double> pile3 =new Stack<Double>();
		HashMap<Integer, Stack<Double>> history_stack=new HashMap<Integer, Stack<Double>>();
		pile.add((double) 1);
		pile.add((double) 2);
		pile.add((double) 3);
		pile1.add((double) 1);
		pile1.add((double) 2);
		pile1.add((double) 3);
		pile2.add((double) 1);
		pile2.add((double) 2);
		pile2.add((double) 3);
		int test=0;
		history_stack.put(0, pile);
		history_stack.put(1, pile1);
		history_stack.put(2, pile2);
		pile3=history_stack.get(2);
		while(test!=history_stack.size())
		{
			//System.out.println("affichage pile "+test+history_stack.get(test)); 
			System.out.println("affichage pile3 test "+pile3.get(test)); 
			test++;
		}
*/
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
package fr.uvsq.solid.pglp_4;

import java.util.Stack;

/**
 * implementation des methodes generiques quit et undo
 */
public class Receiver_Generic {
	/*
	 * implementations de la methode quit
	 */
	public void quit()
	{
		System.exit(0);
	}
	/*
	 * implementation de la methode undo
	 */
	public Stack <Double> undo(Stack<Double> pile )
	{
		pile.pop();
		return  pile;
	}
}

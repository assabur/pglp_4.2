package fr.uvsq.solid.pglp_4;

import Exception.Arithmetic_exception;
import Exception.ManqueOperandeException;
/*
 * classe qui implemente les diferentes methodes de calcul de nos operations
 */
public class Receveir_specific {
	/**
	 * methode de la multiplication
	 * @param a: premier operande
	 * @param b :deuxieme operande
	 * @return
	 */
	
	public double multiplication(double a, double b)throws ManqueOperandeException
	{
		return a*b;
	}
	
	/*	 methode de soustraction
	 */
	public double soustraction (double a,double b)throws ManqueOperandeException
	{ 
		return a-b;
	}
	/*
	 * methode d'addition
	 */
	public double addition (double a,double b) throws ManqueOperandeException
	{
		return a+b;
	}
	/*
	 * methode de division
	 */
	public double division(double a,double b) throws Arithmetic_exception,ManqueOperandeException
	{
		if (b==0)
			throw new Arithmetic_exception();
		return a/b;		
	}
}

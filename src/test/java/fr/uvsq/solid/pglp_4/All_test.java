package fr.uvsq.solid.pglp_4;
import java.util.Scanner;


import org.junit.Before;
import org.junit.Test;

import Exception.CommandeException;
import Exception.Pile_vide_exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class All_test{
 
	private SaisieRpn saisie;
	private MoteurRpn moteur;
	Scanner scanner;
	@Before
	public void setup() throws Pile_vide_exception
	{
		
		moteur=new MoteurRpn();
		saisie=new SaisieRpn();
		//initialisons la pile
		moteur.enregistrer(10);
		moteur.enregistrer(1);
		moteur.enregistrer(0);
		moteur.enregistrer(5);
		moteur.enregistrer(4);
		String additionSaisie="+";
		String divisionSaisie="/";
		String soustractionSaisie="-";
		String multiplicationSaisie="*";
		
	}
	
	@Test
	public void verifie_saisi()
	{
		
		assertThat(saisie.verifisaisie("4"), is(equalTo(true)));
		assertThat(saisie.verifisaisie("+"), is(equalTo(false)));
	}	
	
	
	public void enregistrer_test() throws Pile_vide_exception
	{
		moteur.enregistrer(10);
		assertTrue(moteur.depiler()==10);
	}
	
	@Test
	public void addition_test() throws CommandeException,Pile_vide_exception
	{
		moteur.init();
		moteur.affiche();
		System.out.println("test addition");
		moteur.apply_operation("+");
		moteur.affiche();	
		
	}

	@Test
	public void multiplication_test() throws CommandeException,Pile_vide_exception
	{
		moteur.init();
		moteur.affiche();
		System.out.println("test Multiplication");
		moteur.apply_operation("*");
		moteur.affiche();	
	}
	@Test
	public void division_test() throws CommandeException,Pile_vide_exception
	{
		moteur.init();
		moteur.affiche();
		System.out.println("test division");
		moteur.apply_operation("/");
		moteur.affiche();	
	}
	@Test
	public void soustraction_test() throws CommandeException,Pile_vide_exception
	{
		moteur.init();
		moteur.affiche();
		System.out.println("test soustraction");
		moteur.apply_operation("-");
		moteur.affiche();
	}
	@Test
	public void quit_test() throws CommandeException,Pile_vide_exception
	{
		moteur.init();
		System.out.println("test quit");
		moteur.apply_operation("quit");		
	}
}
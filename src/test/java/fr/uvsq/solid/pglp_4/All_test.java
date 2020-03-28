package fr.uvsq.solid.pglp_4;
import java.util.Scanner;


import org.junit.Before;
import org.junit.Test;

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
		//double test=moteur.depiler();	
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
	public void depiler_test()
	{
		
	}
}
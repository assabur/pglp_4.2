package fr.uvsq.solid.pglp_4;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class All_test{
 
	private SaisieRpn saisie;
	private MoteurRpn moteur;
	Scanner scanner;
	@Before
	public void setup()
	{
		saisie=new SaisieRpn();
		
	}
	
	@Test
	public void verifie_saisi()
	{
		
		assertThat(saisie.verifisaisie("4"), is(equalTo(true)));
		assertThat(saisie.verifisaisie("+"), is(equalTo(false)));
	}	
	
}
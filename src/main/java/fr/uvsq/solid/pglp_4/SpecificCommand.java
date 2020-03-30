package fr.uvsq.solid.pglp_4;

import Exception.Arithmetic_exception;
import Exception.Pile_vide_exception;
/*
 * Interface qui etrends une commande
 */
public interface SpecificCommand extends CommandInterface
{
	/*
	 * toute commande specifique une methode apply
	 */
	public void apply() ;
}

package fr.uvsq.solid.pglp_4;

import Exception.Arithmetic_exception;
import Exception.Pile_vide_exception;

public interface SpecificCommand extends CommandInterface
{
	public void apply() ;
}

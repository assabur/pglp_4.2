package fr.uvsq.solid.pglp_4;
/*
 * Interface qui implemente la structure des commandes generiques 
 */
public interface GeneriqueCommand extends CommandInterface
{
	/*
	 * methode apply utilisé par toutes les commandes generiques
	 * @see fr.uvsq.solid.pglp_4.CommandInterface#apply()
	 */
	public void apply();
}

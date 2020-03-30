package Exception;
/*
 * classe qui implemente l'exception lorsque la pile est pleine
 */
public class Pile_pleine_exception extends Exception
{
	/*
	 * gestion des exceptions l'orsque la pile est pleine
	 */
	public  Pile_pleine_exception()
	{
		System.out.println("votre pile est pleine");
	}

}
